---
marp: true
# theme: gaia
_class: lead
paginate: true
backgroundColor: #fff
---

# Android——ContentProvider内容提供商
[官方参考](https://developer.android.google.cn/guide/topics/providers/content-providers)

- 为本app和其他app提供提供精细的数据访问权限控制的数据访问控制
- 封装数据，并提供数据安全访问的机制
- 当多个app共用数据时才需要（否则用SQLiteDatabase够了）
- 或者当需要管理多种资源的时候，如SQLiteDatabase和视频音频数据同时使用时

---
# 必须涉及的方法
> 类似数据库操作：增删改查
- onCreate() which is called to initialize the provider
- query(Uri, String[], Bundle, CancellationSignal) which returns data to the - caller
- insert(Uri, ContentValues) which inserts new data into the content provider
- update(Uri, ContentValues, Bundle) which updates existing data in the content provider
- delete(Uri, Bundle) which deletes data from the content provider
- getType(Uri) which returns the MIME type of data in the content provider

---
# 