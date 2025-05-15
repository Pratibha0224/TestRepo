

// -----( IS Java Code Template v1.2

import com.wm.data.*;
import com.wm.util.Values;
import com.wm.app.b2b.server.Service;
import com.wm.app.b2b.server.ServiceException;
// --- <<IS-START-IMPORTS>> ---
import com.wm.lang.ns.NSName;
import com.softwareag.util.IDataMap;
// --- <<IS-END-IMPORTS>> ---

public final class byteTest

{
	// ---( internal utility methods )---

	final static byteTest _instance = new byteTest();

	static byteTest _newInstance() { return new byteTest(); }

	static byteTest _cast(Object o) { return (byteTest)o; }

	// ---( server methods )---




	public static final void stringTOByteArr (IData pipeline)
        throws ServiceException
	{
		// --- <<IS-START(stringTOByteArr)>> ---
		// @sigtype java 3.5
		// [i] field:0:required input
		// [o] object:0:required outBytes
		IDataMap pipeMap = new IDataMap(pipeline);
		String inputData = pipeMap.getAsString("input");
		try {
			IData doInvoke = Service.doInvoke(NSName.create("pub.string:stringToBytes"), new IDataMap("string", inputData).getIData());
		pipeMap.put("outBytes",new IDataMap(doInvoke).get("bytes"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// --- <<IS-END>> ---

                
	}
}

