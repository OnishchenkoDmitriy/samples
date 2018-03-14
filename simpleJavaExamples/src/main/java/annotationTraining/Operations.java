package annotationTraining;

import annotationTraining.annotation.Service;
import annotationTraining.service.LazyService;
import annotationTraining.service.SimpleService;

public class Operations {

    public static void main(String[] args) {
        inspectService(SimpleService.class);
        inspectService(LazyService.class);
        inspectService(String.class);

    }

    static void inspectService(Class<?> service){
        if(service.isAnnotationPresent(Service.class)){
            Service annotation = service.getAnnotation(Service.class);
            System.out.println(annotation.name());
        }
    }

}
