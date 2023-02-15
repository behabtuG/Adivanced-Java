package SerializationandDeserialization.CustomizedSerializationandDeserialization;

import java.io.Serializable;

class GfgAccount implements Serializable {
    String username = "gfg_admin";
    transient String pwd = "geeks";
}

