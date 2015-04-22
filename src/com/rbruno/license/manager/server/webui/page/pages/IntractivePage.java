package com.rbruno.license.manager.server.webui.page.pages;

import java.io.IOException;

import com.rbruno.license.manager.server.webui.Request;
import com.rbruno.license.manager.server.webui.Response;
import com.rbruno.license.manager.server.webui.WebUI;
import com.rbruno.license.manager.server.webui.page.Page;

public class IntractivePage extends Page {

	public IntractivePage(WebUI WebUi) {
		super("/info", WebUi);
	}

	public void called(Request request, Response response) throws IOException {
		response.setContentType("text/html");
		response.addToBody("<h3>" + response.getSocket().getInetAddress().getHostAddress() + "</h3>");
		response.send();
	}
	

}
