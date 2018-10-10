package com.lahey;

public class Software extends Product {

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    public boolean equals(Software software){
        if( super.equals(software)
                && this.programmer.equals(software.getProgrammer())
                && this.platform.equals(software.getPlatform())
                && this.os.equals(software.getOs())
                ){
            return true;
        }
        else{

            return false;
        }//end if()

    }//end public boolean equals(Software software)

}