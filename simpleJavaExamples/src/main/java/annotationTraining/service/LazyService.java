package annotationTraining.service;

import annotationTraining.annotation.Init;
import annotationTraining.annotation.Service;

@Service(name = "Very lazy service")
public class LazyService {

    @Init
    public void initService(){
        System.out.println("simple init");
    }
}
