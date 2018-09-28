package info.sjd.service;

import java.util.ArrayList;
import java.util.List;


public class AppendFile extends Thread {
	private String FILE_NAME;
	
	public AppendFile(String FILE_NAME) {
		this.FILE_NAME = FILE_NAME;
	}
	
	public void run(){
		appendFile(FILE_NAME);
		try {
			Thread.sleep(3*60*1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void appendFile(String FILE_NAME) {
		

		/** GET SEED */
		int seed = (int) Get_SHA512.curTime();

		/** Create list of 10 Strings. */
		List<LogRec> log_rec_10 = new ArrayList<LogRec>(10);

		for (int i = 0; i < 10; i++) {
			LogRec log_rec = new LogRec(Get_SHA512.curTime(), Get_SHA512.randomSession9dec(seed + i),
					Get_SHA512.randomIPhex(seed + i));
			log_rec_10.add(log_rec);
		}

		/** Append to the log-file.*/
		FileAccess.saveToFile(FILE_NAME, log_rec_10, true);

	}
}
