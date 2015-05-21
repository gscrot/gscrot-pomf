package gscrot.uploader.pomf;

import iconlib.IconUtils;

import com.redpois0n.gscrot.Capture;
import com.redpois0n.gscrot.CaptureUploader;
import com.redpois0n.gscrot.UploadResponse;

public class PomfUploader extends CaptureUploader {
	
	public PomfUploader() {
		super("pomf", IconUtils.getIcon("pomf", PomfUploader.class));
	}

	@Override
	public UploadResponse process(Capture capture) throws Exception {
		String response = Pomf.upload(capture.getBinary(), capture.getFormat());
		
		UploadResponse ur = new UploadResponse(response, null);
		ur.setRaw(response);
			
		return ur;
		
	}

}
