package az.elixir.social.Controllers;

import az.elixir.social.DTO.OrderDetailsDTO;
import az.elixir.social.Domain.ServiceSubGroupModel;
import az.elixir.social.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;



    @RequestMapping(value = "/order",method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> makeOrder(@RequestBody OrderDetailsDTO orderDetailsDTO) throws Exception {

        try{
//            ServiceSubGroupModel serviceSubGroupModel =serviceSubGroupService.getServiceSubgGroup(id);
//
//            serviceDTOS=servicesService.listOfService(serviceSubGroupModel,lang);


        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return new ResponseEntity<>("OK", HttpStatus.OK);


    }










}
