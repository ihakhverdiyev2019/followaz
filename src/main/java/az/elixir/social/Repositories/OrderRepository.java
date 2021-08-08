package az.elixir.social.Repositories;

import az.elixir.social.DTO.OrderDTO;
import az.elixir.social.Domain.OrderDetailsModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<OrderDetailsModel,Integer> {
}
