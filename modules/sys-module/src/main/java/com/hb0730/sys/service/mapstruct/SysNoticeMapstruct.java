package com.hb0730.sys.service.mapstruct;

import com.hb0730.base.mapstruct.BaseMapstruct;
import com.hb0730.sys.domain.dto.NoticeDto;
import com.hb0730.sys.domain.entity.SysNotice;

/**
 * @author <a href="mailto:huangbing0730@gmail">hb0730</a>
 * @date 2024/4/29
 */
@org.mapstruct.Mapper(componentModel = "spring", unmappedTargetPolicy = org.mapstruct.ReportingPolicy.IGNORE)
public interface SysNoticeMapstruct extends BaseMapstruct<NoticeDto, SysNotice> {
}
