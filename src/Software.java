public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public void setOs(String os){
        this.os = os;
    }
    public String getOs(){
        return os;
    }

    public void setProgrammer(String programmer){
        this.programmer = programmer;
    }
    public String getProgrammer(){
        return programmer;
    }
}
