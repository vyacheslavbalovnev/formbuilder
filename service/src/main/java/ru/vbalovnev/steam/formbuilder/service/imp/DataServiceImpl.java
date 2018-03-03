package ru.vbalovnev.steam.formbuilder.service.imp;

import org.springframework.stereotype.Service;
import ru.vbalovnev.steam.formbuilder.service.DataService;

@Service
public class DataServiceImpl implements DataService {

    @Override
    public String getData() {
        return "data";
    }
}
