package io.sqlc;

public class EVCoreNativeDriver {

  public static final int SQLC_EVCORE_API_VERSION = 1;
  public static final int SQLC_OPEN_READONLY = 0x00001;
  public static final int SQLC_OPEN_READWRITE = 0x00002;
  public static final int SQLC_OPEN_CREATE = 0x00004;
  public static final int SQLC_OPEN_URI = 0x00040;
  public static final int SQLC_OPEN_MEMORY = 0x00080;
  public static final int SQLC_OPEN_NOMUTEX = 0x08000;
  public static final int SQLC_OPEN_FULLMUTEX = 0x10000;
  public static final int SQLC_OPEN_SHAREDCACHE = 0x20000;
  public static final int SQLC_OPEN_PRIVATECACHE = 0x40000;
  public static final int SQLC_RESULT_OK = 0;
  public static final int SQLC_RESULT_ERROR = 1;
  public static final int SQLC_RESULT_INTERNAL = 2;
  public static final int SQLC_RESULT_PERM = 3;
  public static final int SQLC_RESULT_ABORT = 4;
  public static final int SQLC_RESULT_CONSTRAINT = 19;
  public static final int SQLC_RESULT_MISMATCH = 20;
  public static final int SQLC_RESULT_MISUSE = 21;
  public static final int SQLC_RESULT_ROW = 100;
  public static final int SQLC_RESULT_DONE = 101;
  public static final int SQLC_INTEGER = 1;
  public static final int SQLC_FLOAT = 2;
  public static final int SQLC_TEXT = 3;
  public static final int SQLC_BLOB = 4;
  public static final int SQLC_NULL = 5;

  /** Interface to C language function: <br> <code> int sqlc_db_close(sqlc_handle_t db); </code>    */
  public static native int sqlc_db_close(long db);

  /** Interface to C language function: <br> <code> int sqlc_db_errcode(sqlc_handle_t db); </code>    */
  public static native int sqlc_db_errcode(long db);

  /** Interface to C language function: <br> <code> const char *  sqlc_db_errmsg_native(sqlc_handle_t db); </code>    */
  public static native String sqlc_db_errmsg_native(long db);

  /** Interface to C language function: <br> <code> int sqlc_db_key_native_string(sqlc_handle_t db, char *  key_string); </code>    */
  public static native int sqlc_db_key_native_string(long db, String key_string);

  /** Interface to C language function: <br> <code> sqlc_long_t sqlc_db_last_insert_rowid(sqlc_handle_t db); </code>    */
  public static native long sqlc_db_last_insert_rowid(long db);

  /** Interface to C language function: <br> <code> int sqlc_db_total_changes(sqlc_handle_t db); </code>    */
  public static native int sqlc_db_total_changes(long db);

  /** Interface to C language function: <br> <code> const char *  sqlc_errstr_native(int errcode); </code>    */
  public static native String sqlc_errstr_native(int errcode);

  /** Interface to C language function: <br> <code> sqlc_handle_t sqlc_evcore_db_new_qc(sqlc_handle_t db); </code>    */
  public static native long sqlc_evcore_db_new_qc(long db);

  /** Interface to C language function: <br> <code> sqlc_handle_t sqlc_evcore_db_open(int sqlc_evcore_api_version, const char *  filename, int flags); </code>    */
  public static native long sqlc_evcore_db_open(int sqlc_evcore_api_version, String filename, int flags);

  /** Interface to C language function: <br> <code> const char *  sqlc_evcore_qc_execute(sqlc_handle_t qc, const char *  batch_json, int ll); </code>    */
  public static native String sqlc_evcore_qc_execute(long qc, String batch_json, int ll);

  /** Interface to C language function: <br> <code> void sqlc_evcore_qc_finalize(sqlc_handle_t qc); </code>    */
  public static native void sqlc_evcore_qc_finalize(long qc);


} // end of class EVCoreNativeDriver
