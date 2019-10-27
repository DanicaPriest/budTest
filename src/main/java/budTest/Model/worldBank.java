package budTest.Model;

public class WorldBank {
String id;
String iso2Code;
String name;
Region[] region;
LendingType[] lendingType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIso2Code() {
        return iso2Code;
    }

    public void setIso2Code(String iso2Code) {
        this.iso2Code = iso2Code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Region[] getRegion() {
        return region;
    }

    public void setRegion(Region[] region) {
        this.region = region;
    }

    public LendingType[] getLendingType() {
        return lendingType;
    }

    public void setLendingType(LendingType[] lendingType) {
        this.lendingType = lendingType;
    }
}
