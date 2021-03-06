package net.orekyuu.gitthrow.user.port.table;

import org.seasar.doma.*;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.BatchResult;
import org.seasar.doma.jdbc.Result;
import org.springframework.dao.DuplicateKeyException;

import java.util.Optional;

@ConfigAutowireable
@Dao
public interface UserAvatarDao {

    @Insert
    Result<UserAvatarTable> insert(UserAvatarTable userAvatarTable) throws DuplicateKeyException;

    @Delete
    Result<UserAvatarTable> delete(UserAvatarTable userAvatarTable);

    @BatchDelete
    BatchResult<UserAvatarTable> delete(Iterable<UserAvatarTable> userAvatar);

    @Update
    Result<UserAvatarTable> update(UserAvatarTable avatar);

    @Select
    Optional<UserAvatarTable> findById(String id);
}
