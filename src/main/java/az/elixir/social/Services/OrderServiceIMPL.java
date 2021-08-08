package az.elixir.social.Services;

import az.elixir.social.Domain.OrderDetailsModel;
import az.elixir.social.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceIMPL implements OrderService
{

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void addOrder(OrderDetailsModel orderDetailsModel) throws Exception {

        try{


            orderRepository.save(orderDetailsModel);



        }catch (Exception e){
            throw new Exception(e.getMessage());
        }

    }
}
