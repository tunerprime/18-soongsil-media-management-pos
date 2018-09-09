package festival.pos.common.advice;

import org.springframework.http.HttpStatus;

public class ApiException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private HttpStatus httpStatus;
	
	public ApiException() {
		super("APIEXCEPTION");
	}
	
	public ApiException(HttpStatus httpStatus, String msg) {
		super("APIEXCEPTION :: " + msg);
		this.httpStatus = httpStatus;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}
}
