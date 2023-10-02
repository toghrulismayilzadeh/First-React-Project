package backend.demo.serivce;

import backend.demo.map.UserMapper;
import backend.demo.model.dto.UserDto;
import backend.demo.model.entity.User;
import backend.demo.repoistory.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;
    private final UserMapper mapper;
    public void save(UserDto dto) {
        repository.save(mapper.dtoToEntity(dto));
    }

    public List<UserDto> findAll() {
        return repository.findAll().stream()
                .map(mapper :: entityToDto)
                .toList();
    }
}
