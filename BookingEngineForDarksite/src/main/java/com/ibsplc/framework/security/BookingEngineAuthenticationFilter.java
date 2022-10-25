package com.ibsplc.framework.security;

import java.io.IOException;
import java.security.Key;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import javax.crypto.spec.SecretKeySpec;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.DatatypeConverter;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.UnsupportedJwtException;


/**
 * BookingEngineAuthenticationFilter
 * 
 * @author a-4085
 * 
 *         Revision History Revision Date Author Description
 *         -------------------------------------------------------- 0.1 July 20,
 *         2020 Praveesh Created
 * 
 */
public class BookingEngineAuthenticationFilter extends OncePerRequestFilter {
	
	private static final Logger LOGGER = Log4j2Logger.create(BookingEngineAuthenticationFilter.class);

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws ServletException, IOException {
		LOGGER.info("In BookingEngineAuthenticationFilter " + "doFilterInternal ");
		try {
			if (checkJWTToken(request, response)) {
				Claims claims = validateToken(request);
				if (claims.get("authorities") != null) {
					setUpSpringAuthentication(claims);
				} else {
					LOGGER.error("Wrong Authentication header  "+new Date());
					SecurityContextHolder.clearContext();
					response.setStatus(HttpServletResponse.SC_FORBIDDEN);
					((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN);
					return;
				}
			} else {
				LOGGER.error("Authentication header not found "+new Date());
				SecurityContextHolder.clearContext();
				response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
				((HttpServletResponse) response).sendError(HttpServletResponse.SC_UNAUTHORIZED);
				return;
			}
			chain.doFilter(request, response);
		} catch (ExpiredJwtException e) {
			LOGGER.error("Authentication header timedout "+new Date());
			response.setStatus(HttpServletResponse.SC_GATEWAY_TIMEOUT);
			((HttpServletResponse) response).sendError(HttpServletResponse.SC_GATEWAY_TIMEOUT, e.getMessage());
			return;
		} catch (UnsupportedJwtException | MalformedJwtException ex) {
			LOGGER.error("Wrong Authentication header  "+new Date());
			response.setStatus(HttpServletResponse.SC_FORBIDDEN);
			((HttpServletResponse) response).sendError(HttpServletResponse.SC_FORBIDDEN, ex.getMessage());
			return;
		}
	}
	
	private final String HEADER = "Authorization";
	private final String PREFIX = "Bearer ";
	private final String secret = "1A2B3C4D5E6F7G8H9I0J0K9L8M7N6O5P4Q3R2S1T0U1V2W3X4Y5Z";
	
	private boolean checkJWTToken(HttpServletRequest request, HttpServletResponse res) {
		String authenticationHeader = request.getHeader(HEADER);
		if (authenticationHeader == null || !authenticationHeader.startsWith(PREFIX))
			return false;
		return true;
	}

	/**
	 * Tries to parse specified String as a JWT token. If successful, returns User
	 * object with username, id and role prefilled (extracted from token). If
	 * unsuccessful (token is invalid or not containing all required user
	 * properties), simply returns null.
	 * 
	 * @param token the JWT token to parse
	 * @return the User object extracted from specified token or null if a token is
	 *         invalid.
	 */
	private Claims validateToken(HttpServletRequest request) {
		String jwtToken = request.getHeader(HEADER).replace(PREFIX, "");
		SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256;
		byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(secret);
		Key signingKey = new SecretKeySpec(apiKeySecretBytes, signatureAlgorithm.getJcaName());

			return Jwts.parserBuilder().setSigningKey(signingKey).build().parseClaimsJws(jwtToken).getBody();
		
		
	}

	/**
	 * Authentication method in Spring flow
	 * 
	 * @param claims
	 */
	private void setUpSpringAuthentication(Claims claims) {
		@SuppressWarnings("unchecked")
		List<String> authorities = (List) claims.get("authorities");

		UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(claims.getSubject(), null,
				authorities.stream().map(SimpleGrantedAuthority::new).collect(Collectors.toList()));
		SecurityContextHolder.getContext().setAuthentication(auth);
		LOGGER.info("Authentication Success " +new Date());
	}



}
