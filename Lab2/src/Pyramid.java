
public class Pyramid {
	private String Pharaoh;
	private String Ancient_name;	
	private String Modern_name	;
	private double Dynasty;
	private String Site;	
	private double Base1	;
	private double Base2	;
	private double Height;
	private double Slope_dec_degr;
	private double Volume;
	private double latitude;
	private double Longitude;
	private String Type;
	private String Lepsius;
	private String Material;
	private String Comment;
public Pyramid(String l_Pharaoh, String l_Ancient_name,
		String l_Modern_name, double l_Dynasty, String l_Site,	
        double l_Base1,double l_Base2, double l_Height,
        double l_Slope_dec_degr, double l_Volume, double m_latitude,
        double l_Longitude, String l_Type, String l_Lepsius,
        String l_Material,String l_Comment) 
{
	Pharaoh = l_Pharaoh;
	Ancient_name = l_Ancient_name;
	Modern_name = l_Modern_name;
	Dynasty = l_Dynasty;
	Site = l_Site;
	Base1 = l_Base1;
	Base2 = l_Base2;
	Height = l_Height;
	Slope_dec_degr = l_Slope_dec_degr;
	Volume = l_Volume;
	latitude = m_latitude;
	Longitude = l_Longitude;
	Type = l_Type;
	Lepsius = l_Lepsius;
	Material = l_Material;
	Comment = l_Comment;
	
}
public String getPharaoh() {
	return Pharaoh;
}
@Override
	public String toString() {
		
		return getPharaoh() + 
				"," +
	   getAncient_name() + "," +
			   getModern_name() + " ," + getDynasty()+" "+
		 getHeight()
		+ " ," + getLepsius() + ", "+getBase1()
			   + getBase2()+", " + getSite() + ", "+ getComment();
	}
public void setPharaoh(String pharaoh) {
	Pharaoh = pharaoh;
}
public String getAncient_name() {
	return Ancient_name;
}
public void setAncient_name(String ancient_name) {
	Ancient_name = ancient_name;
}
public String getModern_name() {
	return Modern_name;
}
public void setModern_name(String modern_name) {
	Modern_name = modern_name;
}


public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public String getLepsius() {
	return Lepsius;
}
public void setLepsius(String lepsius) {
	Lepsius = lepsius;
}
public String getMaterial() {
	return Material;
}
public void setMaterial(String material) {
	Material = material;
}
public String getComment() {
	return Comment;
}
public void setComment(String comment) {
	Comment = comment;
}
public double getDynasty() {
	return Dynasty;
}
public void setDynasty(double dynasty) {
	Dynasty = dynasty;
}
public String getSite() {
	return Site;
}
public void setSite(String site) {
	Site = site;
}
public double getBase1() {
	return Base1;
}
public void setBase1(double base1) {
	Base1 = base1;
}
public double getBase2() {
	return Base2;
}
public void setBase2(double base2) {
	Base2 = base2;
}
public double getHeight() {
	return Height;
}
public void setHeight(double height) {
	Height = height;
}
public double getSlope_dec_degr() {
	return Slope_dec_degr;
}
public void setSlope_dec_degr(double slope_dec_degr) {
	Slope_dec_degr = slope_dec_degr;
}
public double getVolume() {
	return Volume;
}
public void setVolume(double volume) {
	Volume = volume;
}
public double getLatitude() {
	return latitude;
}
public void setLatitude(double latitude) {
	this.latitude = latitude;
}
public double getLongitude() {
	return Longitude;
}
public void setLongitude(double longitude) {
	Longitude = longitude;
}

}
