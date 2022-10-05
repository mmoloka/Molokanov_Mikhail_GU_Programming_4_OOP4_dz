package data;

public class PC extends Computer {

    private Integer powerSupply;

    public PC(String id, String model, Memory memory, String ssd, Integer powerSupply) {
        super(id, model, memory, ssd);
        this.powerSupply = powerSupply;
    }

    public Integer getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(Integer powerSupply) {
        this.powerSupply = powerSupply;
    }

    @Override
    public String toString() {
        return "Notebook id=" + getId() + ", " +
                "model:'" + getModel() + "', " +
                "memory: " + getMemory() + " GB, " +
                "SSD:" + getSsd() + " GB, " +
                "Power Supply:" + powerSupply;
    }
}
