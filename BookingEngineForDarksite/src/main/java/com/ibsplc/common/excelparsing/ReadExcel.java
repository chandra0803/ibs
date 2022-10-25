package com.ibsplc.common.excelparsing;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ibsplc.flightsearch.vo.AirLinkParameterMasterVO;
import com.ibsplc.flightsearch.vo.AmadeusLanguageCodeVO;
import com.ibsplc.flightsearch.vo.CitiMasterLocalizationVO;
import com.ibsplc.flightsearch.vo.CitiesVO;
import com.ibsplc.flightsearch.vo.FlexPricerDetailsVO;
import com.ibsplc.flightsearch.vo.FlexPricerRequestVO;
import com.ibsplc.flightsearch.vo.ParameterMasterLocalizationVO;
import com.ibsplc.flightsearch.vo.ParameterMasterVO;
import com.ibsplc.flightsearch.vo.PaymentMappingVO;
import com.ibsplc.flightsearch.vo.PosCityMasterVO;
import com.ibsplc.flightsearch.vo.PosDetailsVO;
import com.ibsplc.flightsearch.vo.PromoFaresVO;
import com.ibsplc.flightsearch.vo.RegionVO;
import com.ibsplc.flightsearch.vo.RouteConfigVO;
import com.ibsplc.framework.util.log.Log4j2Logger;
import com.ibsplc.framework.util.log.Logger;
 
public class ReadExcel {
	private static final Logger LOGGER = Log4j2Logger.create(ReadExcel.class);

	private ReadExcel() {
	}
 /**
  * fs
  * @param excelFile
  * @return
  */
	private static Sheet getWorkBook(String excelFile) {

		File file = new File(ReadExcel.class.getClassLoader().getResource(excelFile).getFile());
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		DataFormatter formatter = new DataFormatter();
		// As used 'xlsx' file is used so XSSFWorkbook will be
		// used
		Workbook workbook = null;
		try {
			// Find the file extension by splitting file name in substring and
			// getting only extension name
			String fileExtensionName = excelFile.substring(excelFile.indexOf("."));
			if (null == fileExtensionName || fileExtensionName.isEmpty()) {
				LOGGER.info("Issue with filename extension; File name should be .xls or .xlsx");
				return null;
			}
			if (fileExtensionName.equals(".xls")) {
				// If it is .xls file then create object of HSSFWorkbook class
				workbook = new HSSFWorkbook(inputStream);
			} else if (fileExtensionName.equals(".xlsx")) {
				// If it is .xlsx file then create object of XSSFWorkbook class
				workbook = new XSSFWorkbook(inputStream);
			} else {
				LOGGER.info("Issue with filename extension; File name should be .xls or .xlsx");
				return null;
			}
			
		} catch (IOException e) {
			LOGGER.info("Exception during Excel processing for getWorkBook:" + e);
			e.printStackTrace();
		}finally{
			try {
				workbook.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				inputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return workbook.getSheetAt(0);
	}
/**
 * 
 * @param fileName
 * @return
 */
public static List<ParameterMasterVO> getParameterMasterVOList1(String fileName){
  List<ParameterMasterVO> returnList = new ArrayList<ParameterMasterVO>();
 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	       
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        ParameterMasterVO voObject = new ParameterMasterVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	continue; 
	            	
	            case 1:
	            	continue;
	            case 2:	                 
	            	voObject.setMasterCode(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setMasterDescription( nextCell);
	                break;
	 
	            case 4:	                
	            	voObject.setValue(nextCell);	                 
	                break;
	            case 5:	                
	            	voObject.setOtherLanguageDescription( nextCell);	                
	                break;	 
	               
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    } 
 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getParameterMasterVOList:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getParameterMasterVOList:"+e2);
		e2.printStackTrace();
	}
	return returnList;
}  

/**
 * 
 * @param fileName
 * @return
 */
public static List<AirLinkParameterMasterVO> getParameterMasterVOList(String fileName){
  List<AirLinkParameterMasterVO> returnList = new ArrayList<AirLinkParameterMasterVO>();
 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	       
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        AirLinkParameterMasterVO voObject = new AirLinkParameterMasterVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	            	
	            case 0:
	            	voObject.setCategoryNumber(nextCell);	               
	            	break;            	
	            	
	            case 1:
	            	voObject.setMasterNumber(nextCell);	               
	            	break;
	            case 2:	

	            	voObject.setMasterCode(nextCell);	               
	            	break;	            	
	 
	            case 3:	                
	            	voObject.setMasterDescription( nextCell);
	                break;
	 
	            case 4:	                
	            	voObject.setValue(nextCell);	                 
	                break;
	            case 5:	                
	            	voObject.setActInd( nextCell);	                
	                break;	 
	               
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    } 
 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getParameterMasterVOList:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getParameterMasterVOList:"+e2);
		e2.printStackTrace();
	}
	return returnList;
}  
/**
 * 
 * @param fileName
 * @return
 */
public static List<RouteConfigVO> getRouteConfigVOList(String fileName){
	   
	 List<RouteConfigVO> returnList = new ArrayList<RouteConfigVO>();
	 
		try{
			DataFormatter formatter = new DataFormatter();
			Sheet firstSheet = getWorkBook(fileName);	    
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	       
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        RouteConfigVO voObject = new RouteConfigVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();
	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	voObject.setOrigin(nextCell);
	            	  break;
	            case 1:
	            	voObject.setDestination(nextCell);
	            	  break;
	            case 2:	                 
	            	voObject.setProductMasterCode(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setFlexConfigName( nextCell);
	                break;
	 
	            case 4:	                
	            	voObject.setIsMulticityEnabled(nextCell);	                 
	                break;
	            case 5:	                
	            	voObject.setIsDestinationEnabled( nextCell);	                
	                break;
	            case 6:	                
	            	voObject.setIsRedirectedToSAA( nextCell);	                
	                break;	
	            case 7:	                
	            	voObject.setIsAirlinkRoute( nextCell);	                
	                break;	
	            case 8:	                
	            	voObject.setIsBusinessClass( nextCell);	                
	                break;	
	            case 9:	                
	            	voObject.setIsRouteOperational( nextCell);	                
	                break;	                
	            case 10:	                
	            	voObject.setIsPremiumEnabled( nextCell);	                
	                break;	
	            case 12:	                
	            	voObject.setIsSetDirectTrip( nextCell);	                
	                break;	
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	       // LOGGER.info("returnList:"+returnList);
	    }
	   
	 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getRouteConfigVOList:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getRouteConfigVOList:"+e2);
		e2.printStackTrace();
	} 
	    return returnList;
	}  

/**
 * 
 * @param fileName
 * @return
 */
public static List<CitiesVO> getCityMasterEntitiesList(String fileName) {
	List <CitiesVO> returnList = new ArrayList<CitiesVO>();
	 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	        
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        CitiesVO voObject = new CitiesVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	voObject.setCountryCode(nextCell);	 
	            	break; 
	            	
	            case 1:
	            	voObject.setCityCode(nextCell);	 
	            	  break;
	            case 2:	                 
	            	voObject.setCityDesciption(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setAirportDescription( nextCell);
	                break;	          
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    } 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getCityMasterEntitiesList:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getCityMasterEntitiesList:"+e2);
		e2.printStackTrace();
	} 
	return returnList;
}
 
public static  List<FlexPricerDetailsVO> getFlexPricerDetailsVOList (String fileName) {
	List <FlexPricerDetailsVO> returnList = new ArrayList<FlexPricerDetailsVO>();
	 	
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
			while (iterator.hasNext()) {
				
				Row nextRow = iterator.next();
				if (nextRow.getRowNum() == 0)
					continue; // Header cell
			
				Iterator<Cell> cellIterator = nextRow.cellIterator();

				FlexPricerDetailsVO voObject = new FlexPricerDetailsVO();				
				while (cellIterator.hasNext()) {
					Cell nextCell_1 = cellIterator.next();

					int columnIndex = nextCell_1.getColumnIndex(); 
					String nextCell = formatter.formatCellValue(nextCell_1);

					 
					switch (columnIndex) {

					case 0:
						voObject.setFlexConfigName(nextCell);
						break;

					case 1:
						voObject.setRouteType(nextCell);
						break;
					case 2:
						voObject.setFareFamily1(nextCell);
						break;

					case 3:
						voObject.setFareFamily2(nextCell);
						break;

					case 4:
						voObject.setFareFamily3(nextCell);
						break;
					case 5:
						voObject.setPricingType(nextCell);
						break;

					case 6:
						voObject.setDisplayType(nextCell);
						break;

					case 7:
						voObject.setArrangeBy(nextCell);
						break;

					case 8:
						voObject.setDateRangeValue1(nextCell);
						break;

					case 9:
						voObject.setDateRangeValue2(nextCell);
						break;

					case 10:
						voObject.setDateRangeQualifier1(nextCell);
						break;

					case 11:
						voObject.setDateRangeQualifier2(nextCell);
						break;				 

					case 12:
						voObject.setFareFamilyMcity1(nextCell);
						break;

					case 13:
						voObject.setFareFamilyMcity2(nextCell);
						break;

					case 14:
						voObject.setFareFamilyMcity3(nextCell);
						break;
					}
				}			 
				returnList.add(voObject);
			}
	  
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getFlexPricerDetailsVOList:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getFlexPricerDetailsVOList:"+e2);
		e2.printStackTrace();
	}
 
	return returnList;
}
/**
 * 
 * @param fileName
 * @return
 */
public static List<AmadeusLanguageCodeVO> getAmadeusLanguageCodeList(String fileName) {
	List <AmadeusLanguageCodeVO> returnList = new ArrayList<AmadeusLanguageCodeVO>();
 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	        
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        AmadeusLanguageCodeVO voObject = new AmadeusLanguageCodeVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	continue; 
	            	
	            case 1:
	            	voObject.setMasterNumber(nextCell);	 
	            	  break;
	            case 2:	                 
	            	voObject.setMasterCode(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setAmadeusLangCode( nextCell);
	                break;
	 
	            case 4:	                
	            	voObject.setAmadeusLangDesc(nextCell);	                 
	                break;	                           
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    }
	  
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing:"+e2);
		e2.printStackTrace();
	}
	//LOGGER.info("from getAmadeusLanguageCodeList:"+returnList);
	return returnList;
}
 

/**
 * 
 * @param fileName
 * @return
 */
public static List<PromoFaresVO> getPromoFaresVOList(String fileName) {
	List <PromoFaresVO> returnList = new ArrayList<PromoFaresVO>();
  
	
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	   
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	     
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	       
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        PromoFaresVO voObject = new PromoFaresVO();
	        
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	             
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            switch (columnIndex) {	 
	              
	            case 0:	            	 
	            	Optional.ofNullable(nextCell).ifPresent(var -> { if (var.equalsIgnoreCase("NULL"))  var=null; else voObject.setPromoFareId(Integer.parseInt(var) );});
	            	break;
	            case 1:	                
	            	voObject.setPromoCode(nextCell);	                 
	                break;	             
	            case 2:	                
	            	voObject.setFareBasis(nextCell);	                 
	                break;
	            case 4:	                
	            	voObject.setStartDate(nextCell);	                 
	                break;
	            case 5:	                
	            	voObject.setEndDate(nextCell);	                 
	                break;	                
	            case 8:	                
	            	voObject.setPrivateFareAccountCode(nextCell);	                 
	                break;	                
	            case 9:	            	
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setOrginCode(var));	            	 
	            	break;
	            case 10:	                 
	            	voObject.setDestiCode( nextCell);	               
	                break;	 
	            case 11:
	            	Optional.ofNullable(nextCell).ifPresent(var -> { if (var.equalsIgnoreCase("NULL"))  var=null; else voObject.setStartTime(Float.parseFloat(var) );});
	            	break;	                
	            case 12:  	            	 
	            	Optional.ofNullable(nextCell).ifPresent(var -> { if (var.equalsIgnoreCase("NULL"))  var=null; else voObject.setEndTime(Float.parseFloat(var) );});
	                break; 
	            }
	        }
	     
	        returnList.add(voObject);
	    } 
	 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getPromoFaresVOList:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getPromoFaresVOList:"+e2);
		e2.printStackTrace();
	}
	//LOGGER.info("from getAmadeusLanguageCodeList:"+returnList);
	return returnList;
}


/**
 * 
 * @param fileName
 * @return
 */
public static List<FlexPricerRequestVO> getFlexPricerPOSDetails(String fileName) {
	List <FlexPricerRequestVO> returnList = new ArrayList<FlexPricerRequestVO>();
	 	
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	        
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        FlexPricerRequestVO voObject = new FlexPricerRequestVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            // Switch-case
	            switch (columnIndex) {	 
	            //select queue_office_id,amadeus_office_id,point_of_ticketing,queue_category,
	            //queue_number from airlink_pos_city_master pos where pos.city_code=? and pos.product_master_code=?;    
	            
	            case 9:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setSiteQueueOfficeID(var) );
	            	break;
	            case 3:	                
	            	voObject.setAmadeusSiteOfficeID(nextCell);	                 
	                break;	             
	            case 11:	                
	            	voObject.setSitePointOfTicketing(nextCell);	                 
	                break;
	            case 10:	                
	            	voObject.setSiteQueueCategory(nextCell);	                 
	                break;
	            case 12:	                
	            	voObject.setSiteQueueNumber(nextCell);	                 
	                break;	                
	             
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    }
	 
	    // Closing the workbook and inputstream
 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getFlexPricerPOSDetails:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing- for getFlexPricerPOSDetails:"+e2);
		e2.printStackTrace();
	}
	//LOGGER.info("from getAmadeusLanguageCodeList:"+returnList);
	return returnList;
} 
/**
 * 
 * @param fileName
 * @return
 */
public static List<PosCityMasterVO> getPosCityMasterVODetails(String fileName) {
	List <PosCityMasterVO> returnList = new ArrayList<PosCityMasterVO>();
	
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	          
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	   
	        Iterator<Cell> cellIterator = nextRow.cellIterator();	        
	        PosCityMasterVO voObject = new PosCityMasterVO();
	        
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();	  
	            int columnIndex = nextCell_1.getColumnIndex();   
	            String nextCell = formatter.formatCellValue(nextCell_1);
	           
	            switch (columnIndex) {	 
	               case 0:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setPosId(var) );
	            	break;
	            
	            case 1:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setCityCode(var) );
	            	break;
	            case 2:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setProductMasterCode(var) );
	            	break;
	            	
	            case 3:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setAmadeusOfficeId(var) );
	            	break;
	            	
	            case 4:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setPaymentGateway(var) );
	            	break;
	            	
	            case 5:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setMealInfo(var) );
	            	break;	
	            case 6:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setPreSeating(var) );
	            	break;	
	            case 7:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setActiveIndicator(var) );
	            	break;	
	            case 8:
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setPaymentGatewayType(var) );
	            	break;
	            case 9:	                
	            	voObject.setQueueOfficeId(nextCell);	                 
	                break;	             
	            case 10:	                
	            	voObject.setQueueCategory(nextCell);	                 
	                break;
	            case 11:	                
	            	voObject.setPointOfTicketing(nextCell);	                 
	                break;
	            case 12:	                
	            	voObject.setQueueNumber(nextCell);	                 
	                break;	
	            case 13:	                
	            	voObject.setStoreNumber(nextCell);	                 
	                break;	
	                
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    }
	  
	 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getPosCityMasterVODetails:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getPosCityMasterVODetails:"+e2);
		e2.printStackTrace();
	}
	//LOGGER.info("from getAmadeusLanguageCodeList:"+returnList);
	return returnList;
} 


/**
 * 
 * @param fileName
 * @return
 */
public static List<ParameterMasterLocalizationVO> getParameterMasterLocalizationDetails(String fileName) {
	List <ParameterMasterLocalizationVO> returnList = new ArrayList<ParameterMasterLocalizationVO>();
	
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	          
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	   
	        Iterator<Cell> cellIterator = nextRow.cellIterator();	        
	        ParameterMasterLocalizationVO voObject = new ParameterMasterLocalizationVO();
	        
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();	  
	            int columnIndex = nextCell_1.getColumnIndex();   
	            String nextCell = formatter.formatCellValue(nextCell_1);
	           
	            switch (columnIndex) {	 
	               case 0:
	            	   voObject.setMasterNumber(nextCell);
	            	//Optional.ofNullable(nextCell).ifPresent(var -> voObject.setMasterNumber(var) );
	            	break;
	            
	            case 1:
	            	voObject.setMasterDescription(nextCell);
	            	//Optional.ofNullable(nextCell).ifPresent(var -> voObject.setMasterDescription(var) );
	            	break;
	            case 2:
	            	voObject.setLanguage(nextCell);
	            	//Optional.ofNullable(nextCell).ifPresent(var -> voObject.setLanguage(var) );
	            	break;
	           
	                
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    }
	  
	 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getParameterMasterLocalizationDetails:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getParameterMasterLocalizationDetails:"+e2);
		e2.printStackTrace();
	}
	//LOGGER.info("from getAmadeusLanguageCodeList:"+returnList);
	return returnList;
}


public static List<CitiesVO> getCityMasterList(String fileName) {
	List <CitiesVO> returnList = new ArrayList<CitiesVO>();
	 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	     
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        CitiesVO voObject = new CitiesVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	voObject.setCountryCode(nextCell);	 
	            	break; 
	            	
	            case 1:
	            	voObject.setCityCode(nextCell);	 
	            	  break;
	            case 2:	                 
	            	voObject.setCityDesciption(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setAirportDescription( nextCell);
	                break;
	  
	                           
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    }
	 
	    // Closing the workbook and inputstream
	   
	 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel getCityMasterList processing:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel getCityMasterList processing:"+e2);
		e2.printStackTrace();
	}
	return returnList;
}

public static List<PosDetailsVO> getCountryMasterDetailsVoList(String fileName) {
	List <PosDetailsVO> returnList = new ArrayList<PosDetailsVO>();
	Map<String, String> returnMap = new LinkedHashMap<String, String>(); 
	 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	       
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        PosDetailsVO voObject = new PosDetailsVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	voObject.setRegionCode(nextCell);	 
	            	break; 
	            	
	            case 1:
	            	voObject.setCountryCode(nextCell);	  
	            	
	            	  break;
	            case 2:	                 
	            	voObject.setCountryDesc(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setLang( nextCell);
	                break;
	                
	            case 4:	                
	            	voObject.setActiveIndicator( nextCell);
	                break;
	                
	            case 5:	                
	            	 voObject.setCityCode(nextCell);	            
	                break;
	                
	            case 6:	                
	            	 voObject.setPosType(nextCell);	            
	                break;
	                
	            case 7:	                
	            	 voObject.setCurrency(nextCell);	            
	                break;
	                
	            case 8:	                
	            	 voObject.setAmadeusPos(nextCell);	            
	                break;
	               
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    } 
 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during getCountryMasterDetailsVoList Excel processing:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during getCountryMasterDetailsVoList Excel processing:"+e2);
		e2.printStackTrace();
	}
	return returnList;
}




public static List<RegionVO> getRegionMasterDetailsVoList(String fileName) {
	List <RegionVO> returnList = new ArrayList<RegionVO>();
	Map<String, String> returnMap = new LinkedHashMap<String, String>(); 
	 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	       
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        RegionVO voObject = new RegionVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	voObject.setRegionCode(nextCell);	 
	            	break; 
	            	
	            case 1:
	            	voObject.setRegionDesc(nextCell);	  
	            	
	            	  break; 
	               
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    } 
 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during getRegionMasterDetailsVoList Excel processing:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during getRegionMasterDetailsVoList Excel processing:"+e2);
		e2.printStackTrace();
	}
	return returnList;
}
/**
 * 
 * @param fileName
 * @return
 */

public static List<PaymentMappingVO> getPaymentTypesAllowed(String fileName) {
	List <PaymentMappingVO> returnList = new ArrayList<PaymentMappingVO>();
	 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);	 

	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	       
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; 
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        PaymentMappingVO voObject = new PaymentMappingVO(); 
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex(); 
	            String nextCell = formatter.formatCellValue(nextCell_1); 
	            
	            switch (columnIndex) {	 
	              
	            case 0:
	            	voObject.setPosId(nextCell);	 
	            	break; 
	            	
	            case 1:
	            	voObject.setCategoryNumber(nextCell);	  
	            	
	            	  break;
	            case 2:	                 
	            	voObject.setMasterNumber(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setHours( nextCell);
	                break;
	                
	            case 4:	                
	            	voObject.setActInd( nextCell);
	                break;
	                
	            case 5:	
	            	Optional.ofNullable(nextCell).ifPresent(var -> voObject.setFpValue(var) );			            	         
	                break; 
	               
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    } 
 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getPaymentTypesAllowed:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getPaymentTypesAllowed:"+e2);
		e2.printStackTrace();
	}
	return returnList;
}


/**
 * 
 * @param fileName
 * @return
 */
public static List<CitiMasterLocalizationVO> getCitiMasterLocalizationDetails(String fileName) {
	List <CitiMasterLocalizationVO> returnList = new ArrayList<CitiMasterLocalizationVO>();
	 
	try{
		DataFormatter formatter = new DataFormatter();
		Sheet firstSheet = getWorkBook(fileName);
	 
	    // Iterators to traverse over
	    Iterator<Row> iterator = firstSheet.iterator(); 
	    	 
	    while (iterator.hasNext()) {
	        // Get a row in sheet	       
	        Row nextRow = iterator.next();
	        if(nextRow.getRowNum() == 0) continue; //Header cell
	        // This is for a Row's cells
	        Iterator<Cell> cellIterator = nextRow.cellIterator();
	        
	        CitiMasterLocalizationVO voObject = new CitiMasterLocalizationVO();
	        // Iterate over the cells
	        while (cellIterator.hasNext()) {
	            Cell nextCell_1 = cellIterator.next();
	  
	            int columnIndex = nextCell_1.getColumnIndex();	          
	            // Depends upon the cell contents we need to
	            // typecast
	            String nextCell = formatter.formatCellValue(nextCell_1);
	            
	            // Switch-case
	            switch (columnIndex) {	 
	              
	            case 0:
	            	voObject.setCityCode(nextCell);	 
	            	break; 
	            	
	            case 1:
	            	voObject.setCityDescription(nextCell);	  
	            	
	            	  break;
	            case 2:	                 
	            	voObject.setLocalization(nextCell);	               
	                break;
	 
	            case 3:	                
	            	voObject.setAirportDescription( nextCell);
	                break;
	                
	            
	            }
	        }
	        // Adding up to the list
	        returnList.add(voObject);
	    } 
 
	} catch(java.util.NoSuchElementException e1){
		LOGGER.info("Exception during Excel processing for getPaymentTypesAllowed:"+e1);
		e1.printStackTrace();
	}catch (Exception e2) {
		LOGGER.info("Exception during Excel processing for getPaymentTypesAllowed:"+e2);
		e2.printStackTrace();
	}
	return returnList;
}
}