package sample.customer.biz.service.tran;

import sample.customer.biz.domain.Customer;
import sample.customer.biz.domain.KotaiDounyu;
import sample.customer.biz.service.DataNotFoundException;

import java.util.List;

public interface FukudaTranService {
    
    public void update(KotaiDounyu kotaiDounyu) throws DataNotFoundException;
    public void update2(KotaiDounyu kotaiDounyu) throws DataNotFoundException;
}
