package org.dreaght.stablix.event;

public interface ItemCreationEvent extends ItemEvent, CreationEvent {
    ItemCreationType getCreationType();

    enum ItemCreationType {
        INGREDIENT,
        TABLE
    }
}
