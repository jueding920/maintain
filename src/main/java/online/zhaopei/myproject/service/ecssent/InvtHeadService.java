package online.zhaopei.myproject.service.ecssent;

import java.io.Serializable;
import java.util.List;

import online.zhaopei.myproject.domain.ecssent.InvtHead;

public interface InvtHeadService extends Serializable {

	List<InvtHead> getInvtHeadList(InvtHead invtHead);
}
