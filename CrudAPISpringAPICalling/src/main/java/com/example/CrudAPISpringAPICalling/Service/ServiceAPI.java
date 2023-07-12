package com.example.CrudAPISpringAPICalling.Service;


import com.example.CrudAPISpringAPICalling.Controller.UserDetails;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ServiceAPI {
    private List<UserDetails> dataList;
    public ServiceAPI(List<UserDetails> dataList) {
        this.dataList = dataList;
    }
}
