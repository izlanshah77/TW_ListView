package sg.edu.rp.c346.tw_listview;

public class Module {

    private String name;
    private boolean isCom;

    public Module(String name, boolean isCom) {
        this.name = name;
        this.isCom = isCom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCom() {
        return isCom;
    }

    public void setCom(boolean com) {
        isCom = com;
    }
}
