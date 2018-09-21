package utils;

public class StringWrapper {

	private String data;

	public StringWrapper() {
	}

	public StringWrapper(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	// @Override
	// public String toString() {
	// return data;
	// }
	//
	// public String toJson() {
	// Gson gson = new Gson();
	// String json = gson.toJson(this, StringWrapper.class);
	// return json;
	// }

}
