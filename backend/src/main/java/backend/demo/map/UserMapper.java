package backend.demo.map;

import backend.demo.model.dto.UserDto;
import backend.demo.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {
    @Mapping(target = "id", ignore = true)
    User dtoToEntity(UserDto dto);
    UserDto entityToDto(User user);
}
