
window.$ = window.jQuery;
//var baseUrl = "https://esb-staging.flyairlink.com/";
var baseUrl = "https://10.130.212.10:9443/";
/***************Google Flight Search API Start************/

/**
 * this function act as a receier side from google flight api call
 */
receieveEndFromGoogleFlightSearch();
function receieveEndFromGoogleFlightSearch() {
    console.log("loading");
    var url = window.location.href;
    if (url.indexOf("/gfs/service") > -1 || url.indexOf("/em/service") > -1 || url.indexOf("home.html") > -1) {
        console.log("google flight search or everymundo call [" + url + "]");
        var urlparams = parseURLParams(url);
        if (urlparams !== null && urlparams !== {}) {
            convertToFlightSearchParams(urlparams);
        }
    }
}

/**
 * this function converts url parameters to object map
 * @param {*} url 
 */
function getCountryLanguage(obj) {
    ob = {
        'country': ($("#siteCountry").val() || "za").toUpperCase(),
        'language': ($("#siteLanguage").val() || "en").toUpperCase()
    };
    if (!obj) {
        return 'country=' + ob.country.toUpperCase() + '&language=' + ob.language.toUpperCase();
    } else {
        return ob;
    }

}

function flightUrlStringToPost(url, target) {
    var urlArray = url.split(/(\&|\?)/g);
    var paramArray = urlArray.filter(function (item) { return item.indexOf("=") > -1 });

    var mapForm = document.createElement("form");
    mapForm.target = target;
    mapForm.method = "POST"; // or "post" if appropriate
    mapForm.action = urlArray[0];
    paramArray = paramArray.map(function (item) {
        var keyValue = [item.substring(0, item.indexOf("=")), item.substring(item.indexOf("=") + 1, item.length)];
        item = {};
        item[keyValue[0]] = keyValue[1];
        var mapInput = document.createElement("input");
        mapInput.type = "text";
        mapInput.name = keyValue[0];
        mapInput.value = keyValue[1];
        mapForm.appendChild(mapInput);
        return item;
    });
    $(".hidden-div").remove();
    $("body").append("<div class='hidden-div' style='display:none'></div>");
    $('.hidden-div').append(mapForm);
    return mapForm;
}

function parseURLParams(url) {
    var parms = {};
    try {
        var queryStart = url.indexOf("?") + 1,
            queryEnd = url.indexOf("#") + 1 || url.length + 1,
            query = url.slice(queryStart, queryEnd - 1),
            pairs = query.replace(/\+/g, " ").split("&"),
            i, n, v, nv;

        if (query === url || query === "") return;

        for (i = 0; i < pairs.length; i++) {
            nv = pairs[i].split("=", 2);
            n = decodeURIComponent(nv[0]);
            v = decodeURIComponent(nv[1]);

            if (!parms.hasOwnProperty(n)) parms[n] = [];
            parms[n].push(nv.length === 2 ? v : null);
        }
    } catch (error) {
        parms = {};
        // console.log("Exception in parseURLParams " + error);
    }

    return parms;
}

/**
 * this function converts url params to flight search standard params
 * @param {*} urlParams 
 */
function convertToFlightSearchParams(urlParams) {

    var defParam, from = "", to = "", fromDate = '', toDate = '', adultcount = 0, youngadultcount = 0, childCount = 0, infantCount = 0, tripTyp = "", cabinCls = 0, promo = "";
    try {
        if (urlParams["TripType"] == "RoundTrip") {
            tripTyp = "R";
        } else if (urlParams["TripType"] == "OneWay") {
            tripTyp = "O";
        } else if (urlParams["TripType"] == "MultiCity" || urlParams["TripType"] == "OpenJaw") {
            tripTyp = "M";
        }
        var sliceKey = 0;
        $.each(urlParams, function (key, value) {
            if (key.indexOf('Slice') > -1) {
                if (tripTyp == "R") {
                    var sliceNo = urlParams["Slice2"].toString();
                    var sep = ",";
                    sliceKey = (sliceNo.indexOf(sep) > -1) ? sliceNo.split(sep)[0] : sliceNo;
                } else if (tripTyp == "O") {
                    var sliceNo = urlParams["Slice1"].toString();
                    var sep = ",";
                    sliceKey = (sliceNo.indexOf(sep) > -1) ? sliceNo.split(sep)[1] : sliceNo;
                }
            }
        });

        // console.log("inside convertToFlightSearchParams tripTyp [" + tripTyp + "] slice [" + sliceKey + "]");

        $.each(urlParams, function (key, value) {
            // console.log("inside convertToFlightSearchParams for lopp " + key + key.indexOf('DepartureDate'));
            if (key.indexOf('DepartureDate') > -1) {
                // console.log("fromDate [" + fromDate + "]");
                // if (tripTyp == "M") {
                //     var tempDate = new Date(urlParams[key]);
                //     tempDate = tempDate.getDate() + "-" + (tempDate.getMonth() + 1) + "-" + tempDate.getFullYear();
                //     if (!fromDate) {
                //         fromDate = tempDate;
                //     } else {
                //         fromDate = fromDate.concat(',', tempDate);
                //     }
                // } else if (tripTyp == "O") {
                //     fromDate = new Date(urlParams["DepartureDate1"]);
                // } else if (tripTyp == "R") {
                //     fromDate = new Date(urlParams["DepartureDate1"]);
                //     var toKey = (sliceKey > 0) ? "DepartureDate" + sliceKey.toString() : "DepartureDate2";
                //     // console.log("toKey " + toKey);
                //     toDate = new Date(urlParams[toKey]);
                // }
                if (tripTyp == "M") {
                    var deptDate = String(urlParams[key]);

                    var splitDeptDate = deptDate.split("-");
                    var reqFormat = splitDeptDate[2] + "-" + splitDeptDate[1] + "-" + splitDeptDate[0];
                    // fromDate = reqFormat;

                    // var tempDate = new Date(urlParams[key]);
                    // tempDate=tempDate.getDate() + "-" + (tempDate.getMonth() + 1) + "-" + tempDate.getFullYear();
                    if (!fromDate) {
                        fromDate = reqFormat;
                    } else {
                        fromDate = fromDate.concat(',', reqFormat);
                    }
                } else if (tripTyp == "O") {
                    var deptDate = String(urlParams["DepartureDate1"]);

                    var splitDeptDate = deptDate.split("-");
                    var reqFormat = splitDeptDate[2] + "-" + splitDeptDate[1] + "-" + splitDeptDate[0];
                    fromDate = reqFormat;
                    // fromDate = new Date(urlParams["DepartureDate1"]);
                } else if (tripTyp == "R") {

                    var deptDate = String(urlParams["DepartureDate1"]);

                    var splitDeptDate = deptDate.split("-");
                    var reqFormat = splitDeptDate[2] + "-" + splitDeptDate[1] + "-" + splitDeptDate[0];
                    fromDate = reqFormat;
                    // fromDate = new Date(urlParams["DepartureDate1"]);
                    var toKey = (sliceKey > 0) ? "DepartureDate" + sliceKey.toString() : "DepartureDate2";
                    var returnDate = String(urlParams[toKey]);

                    var splitreturnDate = returnDate.split("-");
                    var reqFormat_ = splitreturnDate[2] + "-" + splitreturnDate[1] + "-" + splitreturnDate[0];
                    toDate = reqFormat_;
                    // console.log("toKey "+toKey);
                    // toDate = new Date(urlParams[toKey]);
                }
            } else if (key.indexOf('Origin') > -1) {
                if (tripTyp == "M") {
                    var tempFrom = urlParams[key].toString();
                    if (!from) {
                        from = tempFrom;
                    } else {
                        from = from.concat(',', tempFrom);
                    }
                } else if (tripTyp == "O") {
                    from = urlParams["Origin1"].toString();
                }
                else {
                    from = urlParams["Origin1"].toString();
                    var destKey = (sliceKey > 0) ? "Origin" + sliceKey.toString() : "Origin2";
                    to = urlParams[destKey].toString();
                }
            } else if (key.indexOf('Destination') > -1) {
                if (tripTyp == "M") {
                    var tempTo = urlParams[key].toString();
                    if (!to) {
                        to = tempTo;
                    } else {
                        to = to.concat(',', tempTo);
                    }
                } else if (tripTyp == "O") {
                    var destKey = (sliceKey > 0) ? "Destination" + sliceKey.toString() : "Destination1";
                    to = urlParams[destKey].toString();
                }
            } else if (key.indexOf('Cabin1') > -1) {
                if (urlParams["Cabin1"] == "Economy") {
                    cabinCls = 0;
                } else if (urlParams["Cabin1"] == "Business") {
                    cabinCls = 1;
                } else if (urlParams["Cabin1"] == "PremiumEconomy") {
                    cabinCls = 2;
                }
            } else if (key.indexOf('Adult') > -1) {
                adultCount = parseInt(urlParams["Adult"]);
            } else if (key.indexOf('Adult') > -1) {
                youngadultcount = parseInt(urlParams["YoungAdult"]);
            } else if (key.indexOf('Child') > -1) {
                childCount = parseInt(urlParams["Child"]);
            } else if (key.indexOf('Infant') > -1) {
                infantCount = parseInt(urlParams["Infant"]);
            } else if (key.indexOf('PromoCode') > -1) {
                promo = urlParams["PromoCode"].toString();
            }
        });

    } catch (error) {
        console.log("Exception in buildUrlParams " + error);
    }

    if (tripTyp !== "" && from !== "" && to !== "" && fromDate !== "") {
        if (tripTyp == "M") {
            console.log("for buildRedirectUrlForMultiCity " + tripTyp + from + to + fromDate + toDate + adultCount + childCount + infantCount + cabinCls);
            buildRedirectUrlForMultiCity(tripTyp, from, to, fromDate, toDate, adultCount, youngadultcount, childCount, infantCount, cabinCls, promo);
        } else {
            buildRedirectUrl(tripTyp, from, to, fromDate, toDate, adultCount, youngadultcount, childCount, infantCount, cabinCls, promo);
        }
    }
}

function buildRedirectUrlForMultiCity(trip, departingOn, returningOn, departureDate, returnDate, adultnode, youngadultnode, childnode, infantnode, cabinClass, promo) {
    // console.log("entered multicity code : ", trip);
    var uniqueId = new Date().getUTCMilliseconds();
    var cl = getCountryLanguage(true);
    var monthNames = new Array('JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN', 'JUL', 'AUG', 'SEP', 'OCT', 'NOV', 'DEC');

    var paramJson = {
        "country": (cl.country || "").toUpperCase(),
        "language": (cl.language || "").toUpperCase(),
        "product": "LRB",
        "isMobileDevice": "false",
        "tripType": trip,
        "departureCity": departingOn,
        "destinationCity": returningOn,
        "departureDate": departureDate,
        "dateFlexible": "",
        "adultCount": adultnode,
        "youngAdultCount": youngadultnode,
        "childCount": childnode,
        "infantCount": infantnode,
        "cabinClass": cabinClass,
        "amadeusReturnUrl": "",
        "promoCode": ((promo && promo.trim()) ? promo.trim() : ''),
        "clientSessionId": "123",
        "returnDate": ''
    };

    try {
        var saveData = $.ajax({
            type: 'POST',
            async: false,
            // headers: {
            //     Authorization: auth,
            // },
            url: baseUrl + "BookingEngine/multicityFlightSearchService",
            processData: false,
            contentType: 'application/json',
            data: JSON.stringify(paramJson),
            cache: false,
            success: function (resultData) {

                // ga('ecommerce:addTransaction', { 'id': uniqueId, 'affiliation': 'Airlink Bookings', 'revenue': '1.00', 'shipping': '0.00', 'tax': '0.00' });
                // ga('ecommerce:addItem', { 'id': uniqueId, 'name': 'booking', 'sku': 'Route : ' + departingOn + ' - ' + returningOn, 'category': 'Booking initiation', 'price': '1.00', 'quantity': '1' });
                // ga('ecommerce:send');
                if (resultData.FlightSearchResponse.resultCode == '200') {
                    if (resultData.FlightSearchResponse.isRedirectedToSAA == true) {
                        var param = '?departCity=' + departingOn + '&flexible=true&fromDate=' + departureDateMulticity + '&destCity=' + returningOn + '&tripType=' + trip + '&infantCount=' + infantnode + '&preferredClass=' + cabinClass + '&childCount=' + childnode + '&adultCount=' + adultnode + '&SKN=' + skinId + ((promo && promo.trim()) ? '&promoCode=' + promo.trim() : '');
                        setTimeout(function () {
                            window.open('http://www.flysaa.com/za/en/flightSearch!deepLinkingFltAvailabilty.action' + param, "_self");
                        }, 0);

                    } else {
                        setTimeout(function () {
                            flightUrlStringToPost(resultData.FlightSearchResponse.flightSearchRedirectUrl,/*'amedeusWin'+resultData.FlightSearchResponse.sessionId*//*'_blank'*/"_self").submit();
                        }, 0);
                    }
                }
            },
            error: function (xhr, ajaxOptions, thrownError) {
                console.log("entered multicity code error : ", trip);
                //top.location.href = 'https://www.flyairlink.com/en-za/';
            }
        });
    } catch (error) {
        // console.log("Exception in buildRedirectUrlForMultiCity " + error);
        top.location.href = 'https://www.flyairlink.com/en-za/';
    }
    return false;
}

/**
 * this function build amadeus redirect url through backend API call
 * @param {*} trip
 * @param {*} departingOn
 * @param {*} returningOn
 * @param {*} departureDate
 * @param {*} returnDate
 * @param {*} adultnode
 * @param {*} childnode
 * @param {*} infantnode
 * @param {*} cabinClass
 * @param {*} promo 
 */
function buildRedirectUrl(trip, departingOn, returningOn, departureDate, returnDate, adultnode, youngadultnode, childnode, infantnode, cabinClass, promo) {
    // console.log(departureDate + " ---- " + returnDate);
    var uniqueId = new Date().getUTCMilliseconds();
    var cl = getCountryLanguage(true);
    var monthNames = new Array('JAN', 'FEB', 'MAR', 'APR', 'MAY', 'JUN', 'JUL', 'AUG', 'SEP', 'OCT', 'NOV', 'DEC');
    var paramJson = {
        "country": (cl.country || "").toUpperCase(),
        "language": (cl.language || "").toUpperCase(),
        "product": "LRB",
        "isMobileDevice": "false",
        "tripType": trip,
        "departureCity": departingOn,
        "destinationCity": returningOn,
        // "departureDate": departureDate.getDate() + "-" + (departureDate.getMonth() + 1) + "-" + departureDate.getFullYear(),
        "departureDate": departureDate,
        "dateFlexible": "",
        "adultCount": adultnode,
        "youngAdultCount": youngadultnode,
        "childCount": childnode,
        "infantCount": infantnode,
        "cabinClass": cabinClass,
        "amadeusReturnUrl": "",
        "promoCode": ((promo && promo.trim()) ? promo.trim() : ''),
        "clientSessionId": "123",
        // "returnDate": (returnDate !== '')?returnDate.getDate() + "-" + (returnDate.getMonth() + 1) + "-" + returnDate.getFullYear():"",
        "returnDate": returnDate
    };
    try {
        var saveData = $.ajax({
            type: 'POST',
            async: false,
            // headers: {
            //     Authorization: auth,
            // },
            url: baseUrl + "BookingEngine/flightSearch",
            processData: false,
            contentType: 'application/json',
            data: JSON.stringify(paramJson),
            cache: false,
            success: function (resultData) {
                if (resultData && resultData.FlightSearchResponse) {
                    if (resultData.FlightSearchResponse.resultCode == '200') {
                        if (resultData.FlightSearchResponse.isRedirectedToSAA == true) {
                            var param = "";
                            if (trip == "O") {
                                param = '?departCity=' + departingOn + '&flexible=true&fromDate=' + departureDate.getDate() + '-' + monthNames[departureDate.getMonth()] + '+' + departureDate.getFullYear() + '&destCity=' + returningOn + '&tripType=' + trip + '&infantCount=' + infantnode + '&preferredClass=' + cabinClass + '&childCount=' + childnode + '&adultCount=' + adultnode + '&SKN=' + skinId + ((promo && promo.trim()) ? '&promoCode=' + promo.trim() : '');
                            } else {
                                param = '?departCity=' + departingOn + '&flexible=true&fromDate=' + departureDate.getDate() + '-' + monthNames[departureDate.getMonth()] + '+' + departureDate.getFullYear() + '&destCity=' + returningOn + '&toDate=' + returndate.getDate() + '-' + monthNames[returndate.getMonth()] + '+' + returndate.getFullYear() + '&tripType=' + trip + '&infantCount=' + infantnode + '&preferredClass=' + cabinClass + '&childCount=' + childnode + '&adultCount=' + adultnode + '&SKN=' + skinId + ((promo && promo.trim()) ? '&promoCode=' + promo.trim() : '');
                            }
                            setTimeout(function () {
                                var urltoOpen = "http://www.flysaa.com/za/en/flightSearch!deepLinkingFltAvailabilty.action" + param;
                                window.open(urltoOpen, "_self");
                            }, 0);
                        } else {
                            // return;
                            setTimeout(function () {
                                flightUrlStringToPost(resultData.FlightSearchResponse.flightSearchRedirectUrl,/*'amedeusWin'+resultData.FlightSearchResponse.sessionId*/'_self').submit();
                            }, 0);
                        }
                    } else {
                        top.location.href = 'https://www.flyairlink.com/en-za/';
                    }
                } else {
                    top.location.href = 'https://www.flyairlink.com/en-za/';
                }

            },
            error: function (xhr, ajaxOptions, thrownError) {
                top.location.href = 'https://www.flyairlink.com/en-za/';
            }
        });
    } catch (error) {
        console.log("Exception in buildRedirectUrl " + error);
        top.location.href = 'https://www.flyairlink.com/en-za/';
    }
}

/***************Google Flight Search API End**************/