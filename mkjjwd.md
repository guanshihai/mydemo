# 滕王云制造ERP系统 - 模块交接文档

---

## 一、概述

本文档涵盖滕王云制造ERP系统中的两个核心模块：
- **人力资源管理模块**
- **品质管理模块**

系统基于低代码平台开发，具体平台操作请参考《操作手册》。

---

## 二、人力资源管理模块

### 2.1 模块架构

人力资源模块包含10个子模块，共54个功能菜单，涵盖员工全生命周期管理。

### 2.2 功能清单

#### 2.2.1 员工档案（10个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 员工基本信息 | qms:ygjbxx:view | t_hr_emp_basic | 员工档案主表，记录员工基础信息、联系方式、学历等 |
| 2 | 合同管理 | qms:htgl:view | t_hr_emp_contract | 员工劳动合同管理 |
| 3 | 合同预警 | all:all:view | c_dt_hr_selecthtyj | 合同到期提醒功能 |
| 4 | 证照管理 | hr:zjgl:view | t_hr_emp_certificate | 员工证书、证照管理 |
| 5 | 学习经历 | hr:xxjl:view | t_hr_emp_education | 员工教育背景 |
| 6 | 工作经历 | hr:gzjl:view | t_hr_emp_work_exp | 员工工作履历 |
| 7 | 奖惩管理 | hr:jcgl:view | t_hr_emp_reward | 员工奖惩记录 |
| 8 | 劳动技能 | hr:ldjn:view | t_hr_emp_skill | 员工技能证书 |
| 9 | 职称评定 | hr:zcpd:view | t_hr_emp_title | 职称评定记录 |
| 10 | 员工关怀 | hr:yggh:view | t_hr_emp_care | 员工关怀记录（生日、节日等） |
| 11 | 转正记录表 | hr:zzjlb:view | t_hr_emp_regular | 员工转正记录 |

**关键字段说明（t_hr_emp_basic）：**
- `emp_code`: 工号（唯一标识）
- `emp_status`: 在职状态（在职/离职/停职等）
- `user_id`: 关联系统用户账号
- `dept_id`: 关联部门
- `post_id`: 关联岗位
- `hire_date`: 入职日期
- `wf_state`: 流程状态（审批流）

#### 2.2.2 招聘管理（3个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 招聘需求 | hr:zpxq:view | t_hr_recruit_demand | 部门提出招聘需求 |
| 2 | 招聘计划 | hr:zpjh:view | t_hr_recruit_plan | 制定招聘计划 |
| 3 | 招聘记录 | hr:zpjl:view | t_hr_recruit_record | 面试、录用记录 |

#### 2.2.3 兼岗兼职（2个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 兼职招聘 | hr:jzzp:view | t_hr_part_time_recruit | 兼职岗位招聘 |
| 2 | 员工兼岗申请 | hr:ygjgsq:view | t_hr_emp_multi_post | 员工申请兼任其他岗位 |

#### 2.2.4 绩效管理（3个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | KPI考核设置 | hr:kpisz:view | t_hr_kpi_config | KPI指标配置 |
| 2 | 员工绩效打分 | hr:ygjxdf:view | t_hr_performance_score | 绩效考核打分 |
| 3 | 计件工资管理 | hr:jjgzgl:view | t_hr_piece_wage | 计件工资核算 |

#### 2.2.5 人事调动（4个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 离职申请 | hr:lzsq:view | t_hr_emp_resign | 员工离职流程 |
| 2 | 停职停薪 | hr:tztx:view | t_hr_emp_suspend | 停职停薪管理 |
| 3 | 员工复职 | hr:ygfz:view | t_hr_emp_reinstate | 复职申请 |
| 4 | 转岗申请 | hr:zgsq:view | t_hr_emp_transfer | 岗位调动 |

#### 2.2.6 薪资管理（7个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 薪资科目 | hr:xzkm:view | t_hr_salary_item | 薪资项目配置（基本工资、津贴等） |
| 2 | 薪资科目模块 | hr:xzkmmk:view | t_hr_salary_module | 薪资模块分组 |
| 3 | 社保设置 | hr:sbsz:view | t_hr_social_security_config | 社保缴纳比例配置 |
| 4 | 公积金设置 | hr:gjjsz:view | t_hr_provident_fund_config | 公积金缴纳比例配置 |
| 5 | 员工薪资设置 | hr:ygxzsz:view | t_hr_emp_salary_config | 员工个人薪资配置 |
| 6 | 月社保管理 | hr:ysbgl:view | t_hr_monthly_social_security | 每月社保缴纳记录 |
| 7 | 月公积金管理 | hr:ygjjgl:view | t_hr_monthly_provident_fund | 每月公积金缴纳记录 |
| 8 | 月薪资管理 | hr:yxzgl:view | t_hr_monthly_salary | 每月工资核算与发放 |

**薪资计算逻辑：**
- 应发工资 = 基本工资 + 各项津贴 + 绩效工资 + 计件工资
- 实发工资 = 应发工资 - 社保个人部分 - 公积金个人部分 - 个税

#### 2.2.7 培训管理（4个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 培训计划 | hr:pxjh:view | t_hr_training_plan | 年度/季度培训计划 |
| 2 | 培训管理 | hr:pxgl:view | t_hr_training | 培训活动组织 |
| 3 | 培训签到 | hr:pxqd:view | t_hr_training_sign | 培训签到记录 |
| 4 | 培训考核 | hr:pxkh:view | t_hr_training_exam | 培训考试成绩 |

#### 2.2.8 人才发展（2个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 晋升规则 | hr:rcfz:view | t_hr_promotion_rule | 晋升条件配置 |
| 2 | 重大表现 | hr:zdbx:view | t_hr_emp_performance | 员工重大表现记录 |

#### 2.2.9 人才信息库（1个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 人才简历 | hr:rcjl:view | t_hr_talent_resume | 外部人才库 |

#### 2.2.10 员工自助查询（3个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 转正申请 | hr:ygzzsq:view | t_hr_emp_regular_apply | 员工自助查看转正申请 |
| 2 | 转岗申请 | hr:ygzgsq:view | t_hr_emp_transfer_apply | 员工自助查看转岗申请 |
| 3 | 离职申请 | - | t_hr_emp_resign_apply | 员工自助查看离职申请 |

---

## 三、品质管理模块

### 3.1 模块架构

品质管理模块包含4个子模块，共15个功能菜单，覆盖IQC（来料检验）、IPQC（制程检验）、OQC（出货检验）全流程。

### 3.2 功能清单

#### 3.2.1 基础资料（5个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 基础资料 | qms:base:view | t_twy_qms_base | 质检基础数据字典（检验类型、缺陷等级等） |
| 2 | 质检项类别 | qms:item:view | t_twy_qms_category | 质检项分类树形结构 |
| 3 | 质检项 | qms:twxzjz:view | t_twy_qms_item_category | 具体质检项配置（检测方法、设备、单位） |
| 4 | 质检方案 | qms:scheme:view | t_twy_qms_scheme + t_twy_qms_scheme_sub | 质检方案模板（主子表） |
| 5 | 质检标准 | qms:standard:view | t_twy_qms_standard + t_twy_qms_standard_sub | 产品质检标准（主子表，关联产品和方案） |

**关键表关系：**
```
t_twy_qms_standard (质检标准主表)
  ├─ cpid (产品ID)
  ├─ zjfaid (质检方案ID) → t_twy_qms_scheme
  └─ t_twy_qms_standard_sub (质检标准明细)
       └─ jyxid (检验项ID) → t_twy_qms_item_category
```

#### 3.2.2 来料IQC（4个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 来料质检 | qms:cgllzjy:view | t_twy_qms_inspection + t_twy_qms_inspection_sub | 来料检验单（主子表），记录检验结果 |
| 2 | 质检待入库 | qms:cgzjdrk:view | c_twy_qms_selectZJDRK | 质检合格待入库列表 |
| 3 | 质检待退货 | qms:cglljy:view | c_twy_qms_selectZJDTH | 质检不合格待退货列表 |
| 4 | 质检退货 | qms:cgzjth:view | t_twy_qms_iqc_th + t_twy_qms_iqc_th_sub | 质检退货单（主子表） |

**业务流程：**
1. 采购入库单生成 → 触发来料质检任务
2. 质检员执行检验 → 填写检验记录（t_twy_qms_inspection_sub）
3. 判定结果：
   - 合格 → 进入"质检待入库" → 生成入库单
   - 不合格 → 进入"质检待退货" → 生成退货单（t_twy_qms_iqc_th）

**关键字段（t_twy_qms_inspection）：**
- `source_type`: 来源类型（采购入库、生产入库等）
- `source_no`: 来源单号
- `source_mainid/source_subid`: 来源单据ID
- `jg`: 检验结果（合格/不合格）
- `wf_state`: 流程状态
- `clzt`: 处理状态（待处理/已入库/已退货）

#### 3.2.3 制程IPQC（4个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 入库质检 | qms:rkjy:view | t_twy_qms_inspection | 生产入库质检 |
| 2 | 质检待入库 | qms:zjdrk:view | c_twy_qms_selectRKZJDRK | 质检合格待入库（隐藏菜单） |
| 3 | 首件质检 | qms:sjzj:view | t_twy_qms_inspection | 首件检验 |
| 4 | 工序质检 | qms:gxzj:view | t_twy_qms_inspection | 工序巡检 |
| 5 | 过程质检 | qms:gczj:view | t_twy_qms_ipqc_process | 过程质检记录 |

**说明：**
- 制程检验复用 `t_twy_qms_inspection` 表，通过 `jylx`（检验类型）字段区分
- `gxid/gxmc`: 关联工序信息
- 首件质检：每批次生产开始时的首件检验
- 工序质检：生产过程中的巡检
- 过程质检：关键工序的参数监控（t_twy_qms_ipqc_process）

#### 3.2.4 出库检OQC（1个菜单）
| 序号 | 菜单名称 | 权限标识 | 核心表 | 功能说明 |
|------|---------|---------|--------|---------|
| 1 | 质检任务 | qms:cjrw:view | t_twy_qms_inspection | 成品出货检验 |

**说明：**
- 销售出库单生成 → 触发OQC质检任务
- 检验合格后才能发货

---

## 四、数据库表结构汇总

### 4.1 人力资源模块核心表
| 表名 | 说明 | 关键字段 |
|------|------|---------|
| t_hr_emp_basic | 员工基本信息（主表） | emp_code, emp_status, user_id, dept_id |
| t_hr_emp_contract | 合同管理 | contract_no, start_date, end_date |
| t_hr_emp_certificate | 证照管理 | cert_type, cert_no, expire_date |
| t_hr_emp_education | 学习经历 | school_name, degree, graduation_date |
| t_hr_emp_work_exp | 工作经历 | company_name, position, start_date, end_date |
| t_hr_emp_salary_config | 员工薪资配置 | emp_id, base_salary, allowance |
| t_hr_monthly_salary | 月薪资管理 | emp_id, salary_month, gross_pay, net_pay |
| t_hr_training | 培训管理 | training_name, training_date, trainer |

### 4.2 品质管理模块核心表
| 表名 | 说明 | 关键字段 |
|------|------|---------|
| t_twy_qms_base | 基础资料字典 | data_type, item_code, item_name |
| t_twy_qms_category | 质检项类别 | flmc, flbm, parent_id, wbs |
| t_twy_qms_item_category | 质检项 | zjxmc, zjxbm, jcff, sb, jcdw |
| t_twy_qms_scheme | 质检方案主表 | fabh, famc |
| t_twy_qms_scheme_sub | 质检方案明细 | mainid, jyxid, zjff, sb |
| t_twy_qms_standard | 质检标准主表 | cpid, bzid, zjfaid, bzlx |
| t_twy_qms_standard_sub | 质检标准明细 | mainid, jyxid, jzz, zxz, zdz |
| t_twy_qms_inspection | 质检单主表 | rwdh, jylx, cpid, jg, wf_state, clzt |
| t_twy_qms_inspection_sub | 质检单明细 | mainid, jcxid, jcjl, jcjg |
| t_twy_qms_iqc_th | 质检退货主表 | thdh, cgdh, gysid, thrq |
| t_twy_qms_iqc_th_sub | 质检退货明细 | mainid, cpid, thsl, sjthsl |

---

## 五、重要业务逻辑

### 5.1 人力资源模块

#### 5.1.1 员工入职流程
1. 创建员工档案（t_hr_emp_basic），只有在职的才能薪资计算，和查出来
3. 配置薪资（t_hr_emp_salary_config）
4. 关联系统用户账号（user_id）
5. 试用期满 → 提交转正申请 → 审批通过 → 更新emp_status为"正式"

#### 5.1.2 月薪资核算流程
1. 每月初从 t_hr_emp_salary_config 读取员工薪资配置
2. 汇总当月考勤、绩效、计件工资
3. 计算社保、公积金、个税
4. 生成 t_hr_monthly_salary 记录
5. 导出工资条

#### 5.1.3 员工离职流程
1. 员工提交离职申请（t_hr_emp_resign）
2. 审批
3. 审批通过 → 更新 t_hr_emp_basic.emp_status = "离职"
4. 结算最后一个月工资
5. 归档员工档案

### 5.2 品质管理模块

#### 5.2.1 质检标准配置流程
1. 配置质检项类别（t_twy_qms_category）
2. 创建具体质检项（t_twy_qms_item_category）
3. 创建质检方案（t_twy_qms_scheme + sub）
4. 为产品配置质检标准（t_twy_qms_standard + sub）
   - 选择产品
   - 选择质检方案
   - 配置每个检验项的基准值、上下限

#### 5.2.2 来料检验流程
1. 采购入库单保存后 → 自动生成质检任务（t_twy_qms_inspection）（可以在系统配置里面设置是否质检，如果不质检会生成一个质检单然后采购出库）
   - source_type = "采购入库"
   - source_mainid = 采购入库单ID
   - 根据物料ID查找质检标准（t_twy_qms_standard）
   - 自动生成检验明细（t_twy_qms_inspection_sub）
2. 质检员执行检验 → 填写检验记录（jcjl）→ 判定结果（jcjg）
3. 主表汇总结果：
   - 全部合格 → jg="合格", clzt="待入库"
   - 存在不合格 → jg="不合格", clzt="待退货"
4. 后续处理：
   - 合格：在"质检待入库"菜单点击"下推入库单"
   - 不合格：在"质检待退货"菜单点击"生成退货单"（t_twy_qms_iqc_th）

#### 5.2.3 制程检验流程
1. 入库质检选择生产任务单的产品，即可质检
2. 首件合格 和上面一致，也是从生产任务单选择产品
3.  工序质检关联bom生成的工序来质检

---

## 六、注意事项

### 6.1 人力资源模块

1. **数据权限**：员工只能查看自己的薪资、考勤等敏感信息，HR可查看全部
2. **审批流程**：离职、转岗、转正等需走审批流，注意 wf_state 字段状态
3. **合同预警**：合同到期前60天自动提醒
5. **员工编号**：emp_code 自动生成

### 6.2 品质管理模块

1. **质检标准维护**：产品变更时需同步更新质检标准
2. **检验项配置**：注意检验项的比较类型（范围、等于、大于等）
3. **数据关联**：质检单通过 source_type + source_mainid 关联来源单据
4. **退货处理**：质检退货需同步更新采购入库单状态
5. **报表统计**：质检合格率、不良率等报表需从 t_twy_qms_inspection 汇总
