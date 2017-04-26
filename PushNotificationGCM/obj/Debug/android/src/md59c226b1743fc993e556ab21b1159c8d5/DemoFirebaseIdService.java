package md59c226b1743fc993e556ab21b1159c8d5;


public class DemoFirebaseIdService
	extends com.google.firebase.iid.FirebaseInstanceIdService
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onTokenRefresh:()V:GetOnTokenRefreshHandler\n" +
			"";
		mono.android.Runtime.register ("PushNotificationGCM.DemoFirebaseIdService, PushNotificationGCM, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", DemoFirebaseIdService.class, __md_methods);
	}


	public DemoFirebaseIdService () throws java.lang.Throwable
	{
		super ();
		if (getClass () == DemoFirebaseIdService.class)
			mono.android.TypeManager.Activate ("PushNotificationGCM.DemoFirebaseIdService, PushNotificationGCM, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onTokenRefresh ()
	{
		n_onTokenRefresh ();
	}

	private native void n_onTokenRefresh ();

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
