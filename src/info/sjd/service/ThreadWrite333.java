package info.sjd.service;

import info.sjd.service.AppendFile;
/**
 * WriteFile
 * 
 * 3 threads 3 times
 * 
 * interval - 3 minutes.
 * 
 */

public class ThreadWrite333 {
	
	public static void threadWrite333(String FILE_NAME) {
		
		for (int i = 0 ; i < 3; i++) {
			new AppendFile(FILE_NAME).start();
		}
		
		
	}

	
	
}
