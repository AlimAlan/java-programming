package day_32_arrays_split;

public class AWSzones {
    public static void main(String[] args) {
        String app = "etsy";
        String zones = "us-east-1,us-west-2,us-west-1";
        System.out.println("----Starting deployment of ETSY app to AWS zones------");
        String[]zonesToDeploy=zones.split(",");
        for(String eachZones:zonesToDeploy){
            System.out.println("Deploying ["+app+"] to "+eachZones+"......");
            System.out.println("Deployment completed for "+eachZones);

           // System.out.println(eachZones);
        }
        System.out.println("******All deployments complete, traffic enabled*******");


    }
}
