package gscrot.uploader.pomf;

import gscrot.api.Plugin;

import com.redpois0n.gscrot.CaptureUploader;

public class PomfPlugin extends Plugin {

	public PomfPlugin() {
		super("pomf");
		CaptureUploader.addUploader(new PomfUploader());
	}

}
