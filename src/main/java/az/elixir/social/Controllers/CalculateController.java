package az.elixir.social.Controllers;

import az.elixir.social.DTO.OrderDTO;
import az.elixir.social.DTO.OrderDetailsDTO;

import az.elixir.social.DTO.ServiceModelFromAdapter;
import az.elixir.social.Domain.ServicesModel;
import az.elixir.social.Services.ServicesService;

import az.elixir.social.Utils.CheckFromAdapter;
import az.elixir.social.Utils.TRYRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class CalculateController {
    @Autowired
    private ServicesService servicesService;



    @RequestMapping(value = "/calculate",method = RequestMethod.GET, produces = "application/json", consumes = "application/json")
    public ResponseEntity<OrderDetailsDTO> checkServiceID(@RequestBody(required=false) OrderDTO orderDTO) throws Exception {

        OrderDetailsDTO orderDetailsDTO = new OrderDetailsDTO();
        TRYRate tryRate = new TRYRate();
        CheckFromAdapter checkFromAdapter = new CheckFromAdapter();
        ServiceModelFromAdapter result = checkFromAdapter.getDataFromAdapter("761");
        System.out.println(result.toString());
        double rate = tryRate.getTryRate();

        System.out.println(orderDTO.toString());

        try{

            ServicesModel servicesModel = servicesService.getById(orderDTO.getServiceId());
//            orderDetailsDTO.setDescription(servicesModel.getDescription());
//            orderDetailsDTO.setStatus("Active");
//            orderDetailsDTO.setPrice(orderDTO.getQuantity()*servicesModel.getRate());




        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

        return new ResponseEntity<>(orderDetailsDTO, HttpStatus.OK);


    }


}
