package code;

import java.util.ArrayList;
import java.util.List;

public class WebServer {

	List<String> webpages;

	public WebServer() {
		initialize();
	}
	
	private void initialize() {
		this.webpages = new ArrayList<String>();
		this.webpages.add("google.com");
		this.webpages.add("stackoverflow.com");
		this.webpages.add("dzone.com");
	}
	
	public static class HTTPErrorCodes {

		int code = 0;
		String name = null;
		String description = null;

		public HTTPErrorCodes(int code, String name, String description) {
			this.code = code;
			this.name = name;
			this.description = description;
		}

		@Override
		public String toString() {
			return this.code + ":" + this.name + ":" + this.description;
		}
	}

	public static final HTTPErrorCodes OK = new HTTPErrorCodes(200, "OK", "Action completed successfully.");
	public static final HTTPErrorCodes CREATED = new HTTPErrorCodes(201, "Created",
			"Success following a post command.");
	public static final HTTPErrorCodes NO_CONTENT = new HTTPErrorCodes(204, "No Content",
			"Server has received the request but there is no content to send back.");
	public static final HTTPErrorCodes MOVED_PERMANENTLY = new HTTPErrorCodes(301, "Moved Permanently",
			"Requested a directory instead of a specific file. The web server added the filename index.html, index.htm, home.html, or home.htm to the URL.");
	public static final HTTPErrorCodes BAD_REQUEST = new HTTPErrorCodes(400, "Bad Request",
			"The request had bad syntax or was impossible to be satisfied.");
	public static final HTTPErrorCodes UNAUTHORIZED = new HTTPErrorCodes(401, "Unauthorized",
			"User failed to provide a valid user name / password required for access to file / directory.");
	public static final HTTPErrorCodes FORBIDDEN = new HTTPErrorCodes(403, "Forbidden",
			"The request does not specify the file name. Or the directory or the file does not have the permission that allows the pages to be viewed from the web.");
	public static final HTTPErrorCodes NOT_FOUND = new HTTPErrorCodes(404, "Not Found",
			"The requested file was not found.");
	public static final HTTPErrorCodes SERVER_ERROR = new HTTPErrorCodes(500, "Server Error",
			"In most cases, this error is a result of a problem with the code or program you are calling rather than with the web server itself.");
	public static final HTTPErrorCodes NOT_IMPLEMENTED = new HTTPErrorCodes(501, "Not Implemented",
			"The server does not support the facility required.");
	public static final HTTPErrorCodes SERVICE_UNAVAILABLE = new HTTPErrorCodes(503, "Service Unavailable",
			"The server cannot process the request due to a system overload. This should be a temporary condition.");
	public static final HTTPErrorCodes GATEWAY_TIMEOUT = new HTTPErrorCodes(504, "Gateway Timeout",
			"The service did not respond within the time frame that the gateway was willing to wait.");



	/**
	 * TODO: Complete the method below.
	 * - This method should put all the HTTP
	 * Errors in the following format into the list.
	 * <CODE:NAME:DESCRIPTION>
	 *
	 * for example:
	 * 200:OK:Action completed successfully.
	 *
	 */
	public List<String> getAllErrors() {

		List<String> errors = new ArrayList<String>();
		errors.add("CODE:NAME:DESCRIPTION");

		//To be completed
		HTTPErrorCodes.

		return errors;
	}

	/**
	 * TODO: Complete the method below.
	 * - This method checks if requested URL is in the
	 *		'webpages' list and returns a string result accordingly
	 *		in the format <code>:<description>
	 *
	 * Consider using the method contains(String) for List<String>
	 *
	 * @param URL
	 *		- requested URL
	 * @return <code>:<description>
	 *		- if URL is empty, error is BAD_REQUEST.
	 *		- else if 'webpages' does not contain URL, error is NO_CONTENT
	 *		- else, it is OK.
	 */
	public String get(String URL) {
		for (int i = 0; i < WebServer.webpages.length; i++){
			if (WebServer.webpages[i] == URL) 
				return URL;

			else if (URL == null)
				return BAD_REQUEST;
			else
				return OK;
		}

	}

	/**
	 * TODO: Complete the method below.
	 *	- This method adds the URL to 'webpages' list and returns 
	 *	a string result accordingly in the format <code>:<description>
	 *
	 * @param URL
	 *		- URL to create
	 * @return <code>:<description>
	 *		- if URL is empty, error is SERVER_ERROR.
	 *		- else, it is CREATED.
	 */
	public String post(String URL) {

		
		if (URL == null)
			return SERVER_ERROR;
		else
			WebServer.webpages.add(URL);

		return null;
	}

	/**
	 * TODO: Complete the method below.
	 * - this method replaces existing URL in 'webpages'
	 * with the newURL passed to the method.
	 * Consider using the methods indexOf(String) and set(int, String) for List<String>.
	 *
	 * @param URL
	 *		- existing url
	 * @param newURL
	 *		- url to replace with
	 * @return <code>:<description>
	 *		- if URL is empty, error is SERVER_ERROR.
	 *		- else if newURL is empty, error is BAD_REQUEST.
	 *		- else
	 *		- if URL is not found in 'webpages', error is NOT_FOUND
	 *		- else, replace URL with newURL and return OK 
	 */
	public String put(String URL, String newURL) {

		//To be completed
		if(URL == null)
			
		return null;
	}

	/**
	* Helper method. No change required.
	*
	* @param str
	*				This is a String
	* @return if String is null or empty, return true, else return false
	*/
	public static boolean isEmpty(String str) {
		if (str == null || str.isEmpty() )
			return true;
		return false;
	}
	
}
