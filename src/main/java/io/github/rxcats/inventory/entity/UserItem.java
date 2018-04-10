package io.github.rxcats.inventory.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.CompoundIndexes;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@CompoundIndexes({
    @CompoundIndex(name = "userIdItemIdIndex", def = "{userId:1, itemId:1}")
})
@Document
public class UserItem {

    @Id
    private String itemSeq;

    /**
     * shard key
     */
    private String userId;

    private int itemId;

    private long quantity;

    public static String itemSeq(String userId, int itemId) {
        return userId + "-" + itemId;
    }

}
