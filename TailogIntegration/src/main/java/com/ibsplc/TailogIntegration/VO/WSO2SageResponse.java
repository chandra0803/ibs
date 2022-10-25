package com.ibsplc.TailogIntegration.VO;

public class WSO2SageResponse extends AbstractVO {
	

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private SageServiceResponse sageServiceResponse;

		public SageServiceResponse getSageServiceResponse() {
			return sageServiceResponse;
		}

		public void setSageServiceResponse(SageServiceResponse SageServiceResponse) {
			this.sageServiceResponse = SageServiceResponse;
		}

		@Override
		public String toString() {
			return "WSO2SageResponse [SageServiceResponse=" + sageServiceResponse + "]";
		}


}
