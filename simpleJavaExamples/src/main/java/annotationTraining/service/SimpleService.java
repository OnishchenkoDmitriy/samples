package annotationTraining.service;

import annotationTraining.annotation.Init;
import annotationTraining.annotation.Service;

@Service(name = "Very simple service")
public class SimpleService {

    @Init
    public void lazyInit() throws Exception{
        System.out.println("lazy init");
    }


    public void otherMethod(){

    }
}
