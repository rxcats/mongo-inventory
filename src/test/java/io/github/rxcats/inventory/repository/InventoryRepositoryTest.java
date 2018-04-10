package io.github.rxcats.inventory.repository;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.rxcats.inventory.entity.UserItem;

@SpringBootTest
@RunWith(SpringRunner.class)
public class InventoryRepositoryTest {

    @Autowired
    private InventoryRepository repository;

    @Test
    public void saveTest() {

        UserItem excepted = userItem("77864", 1);

        UserItem actual = repository.save(excepted);

        assertThat(actual).isEqualTo(excepted);

    }

    private UserItem userItem(String userId, int itemId) {
        UserItem item = new UserItem();
        item.setItemSeq(UserItem.itemSeq(userId, itemId));
        item.setUserId(userId);
        item.setItemId(itemId);
        item.setQuantity(1);
        return item;
    }

}
