package lektion05;

public class Bil {
	private String maerke; // mærke
	private String model;  // model

	// hjul instans variable
	private Hjul vf;
	private Hjul hf;
	private Hjul vb;
	private Hjul hb;


	public Bil(String maerke, String model, Hjul vf, Hjul hf, Hjul vb, Hjul hb) {
		this.maerke = maerke;
		this.model = model;
		this.vf = vf;
		this.hf = hf;
		this.vb = vb;
		this.hb = hb;
	}


	public String getMaerke() {
		return maerke;
	}

	public void setMaerke(String maerke) {
		this.maerke = maerke;
	}

	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Hjul getVf() {
		return vf;
	}
	public void setVf(Hjul vf) {
		this.vf = vf;
	}
	public Hjul getHf() {
		return hf;
	}
	public void setHf(Hjul hf) {
		this.hf = hf;
	}
	public Hjul getVb() {
		return vb;
	}
	public void setVb(Hjul vb) {
		this.vb = vb;
	}
	public Hjul getHb() {
		return hb;
	}
	public void setHb(Hjul hb) {
		this.hb = hb;
	}
	@Override
	public String toString() {
		return "Bil [maerke=" + maerke + ", model=" + model + ", vf=" + vf + ", hf=" + hf + ", vb=" + vb + ", hb=" + hb
				+ "]";
	}
}
