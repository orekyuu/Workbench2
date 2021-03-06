package net.orekyuu.gitthrow.user.domain.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import net.orekyuu.gitthrow.user.port.table.UserSettingTable;

import java.util.Objects;

public class UserSettings {
    private final boolean useGravatar;

    public UserSettings(UserSettingTable table) {
        this(table.isUseGravatar());
    }

    @JsonCreator
    public UserSettings(@JsonProperty("useGravatar") boolean useGravatar) {
        this.useGravatar = useGravatar;
    }

    public boolean isUseGravatar() {
        return useGravatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettings that = (UserSettings) o;
        return useGravatar == that.useGravatar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(useGravatar);
    }

    @Override
    public String toString() {
        return "UserSettings{" +
            "useGravatar=" + useGravatar +
            '}';
    }
}
