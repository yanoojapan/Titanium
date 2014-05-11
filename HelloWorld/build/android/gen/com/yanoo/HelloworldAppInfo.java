package com.yanoo;

import org.appcelerator.titanium.ITiAppInfo;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.TiProperties;
import org.appcelerator.kroll.common.Log;

/* GENERATED CODE
 * Warning - this class was generated from your application's tiapp.xml
 * Any changes you make here will be overwritten
 */
public final class HelloworldAppInfo implements ITiAppInfo
{
	private static final String LCAT = "AppInfo";

	public HelloworldAppInfo(TiApplication app) {
	}

	public String getDeployType() {
		return "development";
	}

	public String getId() {
		return "com.yanoo";
	}

	public String getName() {
		return "HelloWorld";
	}

	public String getVersion() {
		return "1.0";
	}

	public String getPublisher() {
		return "admin";
	}

	public String getUrl() {
		return "http://";
	}

	public String getCopyright() {
		return "2014 by 管理";
	}

	public String getDescription() {
		return "not specified";
	}

	public String getIcon() {
		return "appicon.png";
	}

	public boolean isAnalyticsEnabled() {
		return true;
	}

	public String getGUID() {
		return "2d10cac5-dfa0-470e-8117-334c98eda7b8";
	}

	public boolean isFullscreen() {
		return false;
	}

	public boolean isNavBarHidden() {
		return false;
	}
}
