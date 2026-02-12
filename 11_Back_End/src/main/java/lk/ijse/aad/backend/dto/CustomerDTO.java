package lk.ijse.aad.backend.dto;


public class CustomerDTO {

    private int cId;
    private String cName;
    private String cAddress;
    private String cPhone;


    public CustomerDTO() {
    }


    public CustomerDTO(int cId, String cName, String cAddress, String cPhone) {
        this.cId = cId;
        this.cName = cName;
        this.cAddress = cAddress;
        this.cPhone = cPhone;
    }


    public int getCId() {
        return cId;
    }

    public void setCId(int cId) {
        this.cId = cId;
    }

    public String getCName() {
        return cName;
    }

    public void setCName(String cName) {
        this.cName = cName;
    }

    public String getCAddress() {
        return cAddress;
    }

    public void setCAddress(String cAddress) {
        this.cAddress = cAddress;
    }

    public String getCPhone() {
        return cPhone;
    }

    public void setCPhone(String cPhone) {
        this.cPhone = cPhone;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cAddress='" + cAddress + '\'' +
                ", cPhone='" + cPhone + '\'' +
                '}';
    }
}
