package relampagorojo93.LibsCollection.SpigotDebug.Data;

import relampagorojo93.LibsCollection.SpigotDebug.DebugData;
import relampagorojo93.LibsCollection.SpigotDebug.DebugType;

public class DebugLogData extends DebugData {
	
	public DebugLogData(String message) {
		super(DebugType.LOG, message);
	}
	
}
