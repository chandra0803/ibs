package com.ibsplc.TailogIntegration.VO;


import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

import com.ibsplc.TailogIntegration.util.log.Log4j2Logger;
import com.ibsplc.TailogIntegration.util.log.Logger;



/**
 * @author a-5316
 *
 */
public class AbstractVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private static final Logger LOGGER = Log4j2Logger.create(AbstractVO.class);

	/**
	 * The method to return the values of a VO.
	 */
	public String toString() {
		
		java.lang.reflect.Method[] methods = this.getClass().getMethods();
		int fieldCount = methods.length;
		StringBuffer sBuff = new StringBuffer();
		String methodName;
		
		for (int i = 0; i < fieldCount; i++) {
			try {
				methodName = methods[i].getName();

				if ((methodName.startsWith("get"))
						|| (methodName.startsWith("is"))
						|| (methodName.startsWith("has"))) {

					sBuff.append("\n").append(methodName).append(
					"-->").append(methods[i].invoke(this, new Object[] {
					}));
				}

			} catch (IllegalArgumentException e) {
				LOGGER.error("IllegalArgumentException--",e);
			} catch (IllegalAccessException e) {
				LOGGER.error("IllegalAccessException--",e);
			} catch (InvocationTargetException e) {
				LOGGER.error("InvocationTargetException--",e);
			}
		}	
		return sBuff.toString();
		
	}
}

