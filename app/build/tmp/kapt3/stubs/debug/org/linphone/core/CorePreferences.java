package org.linphone.core;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\\\n\u0002\u0018\u0002\n\u0003\b\u00c7\u0001\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00c9\u00022\u00020\u0001:\u0002\u00c9\u0002B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\'\u0010\u00c0\u0002\u001a\u00030\u00c1\u00022\u0007\u0010\u00c2\u0002\u001a\u00020\u00192\u0007\u0010\u00c3\u0002\u001a\u00020\u00192\t\b\u0002\u0010\u00c4\u0002\u001a\u00020\bH\u0002J\b\u0010\u00c5\u0002\u001a\u00030\u00c1\u0002J\u0010\u0010\u00c6\u0002\u001a\u00020\u00192\u0007\u0010\u00c7\u0002\u001a\u00020\u001cJ\'\u0010\u00c8\u0002\u001a\u00030\u00c1\u00022\u0007\u0010\u00c2\u0002\u001a\u00020\u00192\u0007\u0010\u00c3\u0002\u001a\u00020\u00192\t\b\u0002\u0010\u00c4\u0002\u001a\u00020\bH\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0011\u0010\u0012\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0011\u0010\u0014\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0011\u0010\u0016\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u000bR\u0011\u0010\u0018\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR$\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b#\u0010\u000b\"\u0004\b$\u0010\rR\u0011\u0010%\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b&\u0010\u000bR$\u0010\'\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR$\u0010*\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR$\u0010-\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\rR$\u00100\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u0011\u00103\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\b4\u0010\u001fR\u0011\u00105\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b6\u0010\u001bR$\u00107\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00068F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0011\u0010<\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b=\u0010\u001bR\u0011\u0010>\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\b?\u0010\u000bR$\u0010@\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010\u000b\"\u0004\bB\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010C\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bD\u0010\u001f\"\u0004\bE\u0010!R\u0014\u0010F\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\bG\u0010\u000bR$\u0010H\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bI\u0010\u000b\"\u0004\bJ\u0010\rR\u0011\u0010K\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\bL\u0010\u001bR(\u0010M\u001a\u0004\u0018\u00010\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bN\u0010\u001b\"\u0004\bO\u0010PR\u0011\u0010Q\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\bR\u0010\u001bR\u0011\u0010S\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\bT\u0010\u001bR\u0011\u0010U\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\bV\u0010\u001bR\u0011\u0010W\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\bX\u0010\u001bR\u0011\u0010Y\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\bZ\u0010\u001fR$\u0010[\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00198F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\\\u0010\u001b\"\u0004\b]\u0010PR$\u0010^\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b_\u0010\u000b\"\u0004\b`\u0010\rR\u0011\u0010a\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\bb\u0010\u000bR$\u0010c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bd\u0010\u000b\"\u0004\be\u0010\rR\u0011\u0010f\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\bg\u0010\u000bR$\u0010h\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010\u000b\"\u0004\bj\u0010\rR\u0011\u0010k\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\bl\u0010\u000bR$\u0010m\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bn\u0010\u000b\"\u0004\bo\u0010\rR$\u0010p\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bq\u0010\u000b\"\u0004\br\u0010\rR$\u0010s\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bt\u0010\u000b\"\u0004\bu\u0010\rR\u0011\u0010v\u001a\u00020\b8F\u00a2\u0006\u0006\u001a\u0004\bw\u0010\u000bR\u001d\u0010x\u001a\u0004\u0018\u00010y8FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b|\u0010}\u001a\u0004\bz\u0010{R\u0011\u0010~\u001a\u00020\u00198F\u00a2\u0006\u0006\u001a\u0004\b\u007f\u0010\u001bR\u0013\u0010\u0080\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010\u000bR\'\u0010\u0082\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010\u000b\"\u0005\b\u0084\u0001\u0010\rR\u0013\u0010\u0085\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u000bR\'\u0010\u0087\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0088\u0001\u0010\u000b\"\u0005\b\u0089\u0001\u0010\rR\'\u0010\u008a\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008b\u0001\u0010\u000b\"\u0005\b\u008c\u0001\u0010\rR\'\u0010\u008d\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010\u000b\"\u0005\b\u008f\u0001\u0010\rR\'\u0010\u0090\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0091\u0001\u0010\u000b\"\u0005\b\u0092\u0001\u0010\rR\'\u0010\u0093\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0094\u0001\u0010\u000b\"\u0005\b\u0095\u0001\u0010\rR\u0013\u0010\u0096\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010\u000bR\u0013\u0010\u0098\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010\u000bR\'\u0010\u009a\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009b\u0001\u0010\u000b\"\u0005\b\u009c\u0001\u0010\rR\'\u0010\u009d\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009e\u0001\u0010\u000b\"\u0005\b\u009f\u0001\u0010\rR\'\u0010\u00a0\u0001\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a1\u0001\u0010\u001f\"\u0005\b\u00a2\u0001\u0010!R\'\u0010\u00a3\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a4\u0001\u0010\u000b\"\u0005\b\u00a5\u0001\u0010\rR\u0013\u0010\u00a6\u0001\u001a\u00020\u00198F\u00a2\u0006\u0007\u001a\u0005\b\u00a7\u0001\u0010\u001bR\u0013\u0010\u00a8\u0001\u001a\u00020\u00198F\u00a2\u0006\u0007\u001a\u0005\b\u00a9\u0001\u0010\u001bR\'\u0010\u00aa\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ab\u0001\u0010\u000b\"\u0005\b\u00ac\u0001\u0010\rR\'\u0010\u00ad\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ae\u0001\u0010\u000b\"\u0005\b\u00af\u0001\u0010\rR\'\u0010\u00b0\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b1\u0001\u0010\u000b\"\u0005\b\u00b2\u0001\u0010\rR\'\u0010\u00b3\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b4\u0001\u0010\u000b\"\u0005\b\u00b5\u0001\u0010\rR\u0013\u0010\u00b6\u0001\u001a\u00020\u001c8F\u00a2\u0006\u0007\u001a\u0005\b\u00b7\u0001\u0010\u001fR\u0013\u0010\u00b8\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00b9\u0001\u0010\u000bR\'\u0010\u00ba\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bb\u0001\u0010\u000b\"\u0005\b\u00bc\u0001\u0010\rR\u0013\u0010\u00bd\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00be\u0001\u0010\u000bR\u0013\u0010\u00bf\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00c0\u0001\u0010\u000bR\'\u0010\u00c1\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c2\u0001\u0010\u000b\"\u0005\b\u00c3\u0001\u0010\rR\'\u0010\u00c4\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c5\u0001\u0010\u000b\"\u0005\b\u00c6\u0001\u0010\rR\'\u0010\u00c7\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c8\u0001\u0010\u000b\"\u0005\b\u00c9\u0001\u0010\rR\u0013\u0010\u00ca\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00cb\u0001\u0010\u000bR\'\u0010\u00cc\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00cd\u0001\u0010\u000b\"\u0005\b\u00ce\u0001\u0010\rR\'\u0010\u00cf\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d0\u0001\u0010\u000b\"\u0005\b\u00d1\u0001\u0010\rR\u0013\u0010\u00d2\u0001\u001a\u00020\u00198F\u00a2\u0006\u0007\u001a\u0005\b\u00d3\u0001\u0010\u001bR\'\u0010\u00d4\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d5\u0001\u0010\u000b\"\u0005\b\u00d6\u0001\u0010\rR\'\u0010\u00d7\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d8\u0001\u0010\u000b\"\u0005\b\u00d9\u0001\u0010\rR\'\u0010\u00da\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00db\u0001\u0010\u000b\"\u0005\b\u00dc\u0001\u0010\rR\'\u0010\u00dd\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00de\u0001\u0010\u000b\"\u0005\b\u00df\u0001\u0010\rR\u0013\u0010\u00e0\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00e1\u0001\u0010\u000bR\u0013\u0010\u00e2\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00e3\u0001\u0010\u000bR\u0013\u0010\u00e4\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00e5\u0001\u0010\u000bR\u0013\u0010\u00e6\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00e7\u0001\u0010\u000bR\u0013\u0010\u00e8\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00e9\u0001\u0010\u000bR\u0013\u0010\u00ea\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00eb\u0001\u0010\u000bR\u0013\u0010\u00ec\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00ed\u0001\u0010\u000bR\'\u0010\u00ee\u0001\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ef\u0001\u0010\u000b\"\u0005\b\u00f0\u0001\u0010\rR\u0013\u0010\u00f1\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00f2\u0001\u0010\u000bR\u0013\u0010\u00f3\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00f4\u0001\u0010\u000bR\u0013\u0010\u00f5\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00f6\u0001\u0010\u000bR\u0013\u0010\u00f7\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00f8\u0001\u0010\u000bR\u0013\u0010\u00f9\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00fa\u0001\u0010\u000bR\u0013\u0010\u00fb\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00fc\u0001\u0010\u000bR\u0013\u0010\u00fd\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00fe\u0001\u0010\u000bR\u0013\u0010\u00ff\u0001\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010\u000bR\u0013\u0010\u0081\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010\u000bR\u0013\u0010\u0083\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0084\u0002\u0010\u000bR\'\u0010\u0085\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0086\u0002\u0010\u000b\"\u0005\b\u0087\u0002\u0010\rR\u0013\u0010\u0088\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0089\u0002\u0010\u000bR\u0013\u0010\u008a\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u008b\u0002\u0010\u000bR\u0013\u0010\u008c\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u008d\u0002\u0010\u000bR\u0013\u0010\u008e\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u008f\u0002\u0010\u000bR\u0013\u0010\u0090\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0091\u0002\u0010\u000bR\u0013\u0010\u0092\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0093\u0002\u0010\u000bR\u0013\u0010\u0094\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0095\u0002\u0010\u000bR\u0013\u0010\u0096\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u0097\u0002\u0010\u000bR\'\u0010\u0098\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0099\u0002\u0010\u000b\"\u0005\b\u009a\u0002\u0010\rR\u0013\u0010\u009b\u0002\u001a\u00020\u00198F\u00a2\u0006\u0007\u001a\u0005\b\u009c\u0002\u0010\u001bR\'\u0010\u009d\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009e\u0002\u0010\u000b\"\u0005\b\u009f\u0002\u0010\rR\'\u0010\u00a0\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a1\u0002\u0010\u000b\"\u0005\b\u00a2\u0002\u0010\rR\u0013\u0010\u00a3\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00a4\u0002\u0010\u000bR\'\u0010\u00a5\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a6\u0002\u0010\u000b\"\u0005\b\u00a7\u0002\u0010\rR\'\u0010\u00a8\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a9\u0002\u0010\u000b\"\u0005\b\u00aa\u0002\u0010\rR\u0013\u0010\u00ab\u0002\u001a\u00020\u00198F\u00a2\u0006\u0007\u001a\u0005\b\u00ac\u0002\u0010\u001bR\u0013\u0010\u00ad\u0002\u001a\u00020\u00198F\u00a2\u0006\u0007\u001a\u0005\b\u00ae\u0002\u0010\u001bR\'\u0010\u00af\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b0\u0002\u0010\u000b\"\u0005\b\u00b1\u0002\u0010\rR\'\u0010\u00b2\u0002\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b3\u0002\u0010\u000b\"\u0005\b\u00b4\u0002\u0010\rR+\u0010\u00b5\u0002\u001a\u0004\u0018\u00010\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b6\u0002\u0010\u001b\"\u0005\b\u00b7\u0002\u0010PR\u0013\u0010\u00b8\u0002\u001a\u00020\b8F\u00a2\u0006\u0007\u001a\u0005\b\u00b9\u0002\u0010\u000bR\'\u0010\u00ba\u0002\u001a\u00020\u001c2\u0006\u0010\u0007\u001a\u00020\u001c8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bb\u0002\u0010\u001f\"\u0005\b\u00bc\u0002\u0010!R+\u0010\u00bd\u0002\u001a\u0004\u0018\u00010\u00192\b\u0010\u0007\u001a\u0004\u0018\u00010\u00198F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00be\u0002\u0010\u001b\"\u0005\b\u00bf\u0002\u0010P\u00a8\u0006\u00ca\u0002"}, d2 = {"Lorg/linphone/core/CorePreferences;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "_config", "Lorg/linphone/core/Config;", "value", "", "acceptEarlyMedia", "getAcceptEarlyMedia", "()Z", "setAcceptEarlyMedia", "(Z)V", "allowDtlsTransport", "getAllowDtlsTransport", "allowEndToEndEncryptedChatWithoutPresence", "getAllowEndToEndEncryptedChatWithoutPresence", "allowGroupChatWithoutPresence", "getAllowGroupChatWithoutPresence", "allowMultipleFilesAndTextInSameMessage", "getAllowMultipleFilesAndTextInSameMessage", "askForAccountPasswordToAccessSettings", "getAskForAccountPasswordToAccessSettings", "audioVideoConferenceServerUri", "", "getAudioVideoConferenceServerUri", "()Ljava/lang/String;", "", "autoAnswerDelay", "getAutoAnswerDelay", "()I", "setAutoAnswerDelay", "(I)V", "autoAnswerEnabled", "getAutoAnswerEnabled", "setAutoAnswerEnabled", "autoRemoteProvisioningOnConfigUriHandler", "getAutoRemoteProvisioningOnConfigUriHandler", "autoStart", "getAutoStart", "setAutoStart", "automaticallyStartCallRecording", "getAutomaticallyStartCallRecording", "setAutomaticallyStartCallRecording", "callRightAway", "getCallRightAway", "setCallRightAway", "chatRoomShortcuts", "getChatRoomShortcuts", "setChatRoomShortcuts", "checkUpdateAvailableInterval", "getCheckUpdateAvailableInterval", "conferenceServerUri", "getConferenceServerUri", "config", "getConfig", "()Lorg/linphone/core/Config;", "setConfig", "(Lorg/linphone/core/Config;)V", "configPath", "getConfigPath", "contactOrganizationVisible", "getContactOrganizationVisible", "contactsShortcuts", "getContactsShortcuts", "setContactsShortcuts", "darkMode", "getDarkMode", "setDarkMode", "darkModeAllowed", "getDarkModeAllowed", "debugLogs", "getDebugLogs", "setDebugLogs", "debugPopupCode", "getDebugPopupCode", "defaultAccountAvatarPath", "getDefaultAccountAvatarPath", "setDefaultAccountAvatarPath", "(Ljava/lang/String;)V", "defaultDomain", "getDefaultDomain", "defaultRingtonePath", "getDefaultRingtonePath", "defaultRlsUri", "getDefaultRlsUri", "defaultValuesPath", "getDefaultValuesPath", "delayBeforeShowingContactsSearchSpinner", "getDelayBeforeShowingContactsSearchSpinner", "deviceName", "getDeviceName", "setDeviceName", "disableBroadcastConference", "getDisableBroadcastConference", "setDisableBroadcastConference", "disableChat", "getDisableChat", "disableSecureMode", "getDisableSecureMode", "setDisableSecureMode", "disableVideo", "getDisableVideo", "displayOrganization", "getDisplayOrganization", "setDisplayOrganization", "dtmfKeypadVibration", "getDtmfKeypadVibration", "enableAnimations", "getEnableAnimations", "setEnableAnimations", "enableFullScreenWhenJoiningVideoCall", "getEnableFullScreenWhenJoiningVideoCall", "setEnableFullScreenWhenJoiningVideoCall", "enableFullScreenWhenJoiningVideoConference", "getEnableFullScreenWhenJoiningVideoConference", "setEnableFullScreenWhenJoiningVideoConference", "enableNativeAddressBookIntegration", "getEnableNativeAddressBookIntegration", "encryptedSharedPreferences", "Landroid/content/SharedPreferences;", "getEncryptedSharedPreferences", "()Landroid/content/SharedPreferences;", "encryptedSharedPreferences$delegate", "Lkotlin/Lazy;", "factoryConfigPath", "getFactoryConfigPath", "fetchContactsFromDefaultDirectory", "getFetchContactsFromDefaultDirectory", "firstStart", "getFirstStart", "setFirstStart", "forceEndToEndEncryptedChat", "getForceEndToEndEncryptedChat", "forcePortrait", "getForcePortrait", "setForcePortrait", "hideChatMessageContentInNotification", "getHideChatMessageContentInNotification", "setHideChatMessageContentInNotification", "hideEmptyRooms", "getHideEmptyRooms", "setHideEmptyRooms", "hideLinkPhoneNumber", "getHideLinkPhoneNumber", "setHideLinkPhoneNumber", "hideRoomsFromRemovedProxies", "getHideRoomsFromRemovedProxies", "setHideRoomsFromRemovedProxies", "hideSipContactsList", "getHideSipContactsList", "hideStaticImageCamera", "getHideStaticImageCamera", "holdToRecordVoiceMessage", "getHoldToRecordVoiceMessage", "setHoldToRecordVoiceMessage", "keepServiceAlive", "getKeepServiceAlive", "setKeepServiceAlive", "lastUpdateAvailableCheckTimestamp", "getLastUpdateAvailableCheckTimestamp", "setLastUpdateAvailableCheckTimestamp", "limeSecurityPopupEnabled", "getLimeSecurityPopupEnabled", "setLimeSecurityPopupEnabled", "limeServerUrl", "getLimeServerUrl", "linphoneDefaultValuesPath", "getLinphoneDefaultValuesPath", "logcatLogsOutput", "getLogcatLogsOutput", "setLogcatLogsOutput", "makePublicMediaFilesDownloaded", "getMakePublicMediaFilesDownloaded", "setMakePublicMediaFilesDownloaded", "manuallyDisabledTelecomManager", "getManuallyDisabledTelecomManager", "setManuallyDisabledTelecomManager", "markAsReadUponChatMessageNotificationDismissal", "getMarkAsReadUponChatMessageNotificationDismissal", "setMarkAsReadUponChatMessageNotificationDismissal", "maxConferenceParticipantsForMosaicLayout", "getMaxConferenceParticipantsForMosaicLayout", "onlyShowSipContactsList", "getOnlyShowSipContactsList", "pauseCallsWhenAudioFocusIsLost", "getPauseCallsWhenAudioFocusIsLost", "setPauseCallsWhenAudioFocusIsLost", "preferNormalizedPhoneNumbersFromAddressBook", "getPreferNormalizedPhoneNumbersFromAddressBook", "preventInterfaceFromShowingUp", "getPreventInterfaceFromShowingUp", "preventMoreThanOneFilePerMessage", "getPreventMoreThanOneFilePerMessage", "setPreventMoreThanOneFilePerMessage", "publishPresence", "getPublishPresence", "setPublishPresence", "readAndAgreeTermsAndPrivacy", "getReadAndAgreeTermsAndPrivacy", "setReadAndAgreeTermsAndPrivacy", "readOnlyNativeContacts", "getReadOnlyNativeContacts", "redirectDeclinedCallToVoiceMail", "getRedirectDeclinedCallToVoiceMail", "setRedirectDeclinedCallToVoiceMail", "replaceSipUriByUsername", "getReplaceSipUriByUsername", "setReplaceSipUriByUsername", "ringtonesPath", "getRingtonesPath", "routeAudioToBluetoothIfAvailable", "getRouteAudioToBluetoothIfAvailable", "setRouteAudioToBluetoothIfAvailable", "routeAudioToSpeakerWhenVideoIsEnabled", "getRouteAudioToSpeakerWhenVideoIsEnabled", "setRouteAudioToSpeakerWhenVideoIsEnabled", "sendEarlyMedia", "getSendEarlyMedia", "setSendEarlyMedia", "sendVoiceRecordingRightAway", "getSendVoiceRecordingRightAway", "setSendVoiceRecordingRightAway", "showAboutInSideMenu", "getShowAboutInSideMenu", "showAccountSettings", "getShowAccountSettings", "showAccountsInSideMenu", "getShowAccountsInSideMenu", "showAdvancedSettings", "getShowAdvancedSettings", "showAllRingtones", "getShowAllRingtones", "showAssistantInSideMenu", "getShowAssistantInSideMenu", "showAudioSettings", "getShowAudioSettings", "showCallOverlay", "getShowCallOverlay", "setShowCallOverlay", "showCallSettings", "getShowCallSettings", "showChatSettings", "getShowChatSettings", "showConferencesSettings", "getShowConferencesSettings", "showContactInviteBySms", "getShowContactInviteBySms", "showContactsSettings", "getShowContactsSettings", "showCreateAccount", "getShowCreateAccount", "showEmojiPickerButton", "getShowEmojiPickerButton", "showGenericLogin", "getShowGenericLogin", "showLinphoneLogin", "getShowLinphoneLogin", "showNetworkSettings", "getShowNetworkSettings", "showNewContactAccountDialog", "getShowNewContactAccountDialog", "setShowNewContactAccountDialog", "showQuitInSideMenu", "getShowQuitInSideMenu", "showRecordingsInSideMenu", "getShowRecordingsInSideMenu", "showRemoteProvisioning", "getShowRemoteProvisioning", "showScheduledConferencesInSideMenu", "getShowScheduledConferencesInSideMenu", "showScreenshotButton", "getShowScreenshotButton", "showSettingsInSideMenu", "getShowSettingsInSideMenu", "showTunnelSettings", "getShowTunnelSettings", "showVideoSettings", "getShowVideoSettings", "skipDialerForNewCallAndTransfer", "getSkipDialerForNewCallAndTransfer", "setSkipDialerForNewCallAndTransfer", "staticPicturePath", "getStaticPicturePath", "storePresenceInNativeContact", "getStorePresenceInNativeContact", "setStorePresenceInNativeContact", "systemWideCallOverlay", "getSystemWideCallOverlay", "setSystemWideCallOverlay", "useEphemeralPerDeviceMode", "getUseEphemeralPerDeviceMode", "useInAppFileViewerForNonEncryptedFiles", "getUseInAppFileViewerForNonEncryptedFiles", "setUseInAppFileViewerForNonEncryptedFiles", "useTelecomManager", "getUseTelecomManager", "setUseTelecomManager", "userCertificatesPath", "getUserCertificatesPath", "vfsCachePath", "getVfsCachePath", "vfsEnabled", "getVfsEnabled", "setVfsEnabled", "videoPreview", "getVideoPreview", "setVideoPreview", "voiceMailUri", "getVoiceMailUri", "setVoiceMailUri", "voiceMessagesFormatMkv", "getVoiceMessagesFormatMkv", "voiceRecordingMaxDuration", "getVoiceRecordingMaxDuration", "setVoiceRecordingMaxDuration", "xmlRpcServerUrl", "getXmlRpcServerUrl", "setXmlRpcServerUrl", "copy", "", "from", "to", "overrideIfExists", "copyAssetsFromPackage", "getString", "resource", "move", "Companion", "app_debug"})
public final class CorePreferences {
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable
    private org.linphone.core.Config _config;
    public static final int OVERLAY_CLICK_SENSITIVITY = 10;
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String encryptedSharedPreferencesFile = "encrypted.pref";
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy encryptedSharedPreferences$delegate = null;
    @org.jetbrains.annotations.NotNull
    public static final org.linphone.core.CorePreferences.Companion Companion = null;
    
    public CorePreferences(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final org.linphone.core.Config getConfig() {
        return null;
    }
    
    public final void setConfig(@org.jetbrains.annotations.NotNull
    org.linphone.core.Config value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final android.content.SharedPreferences getEncryptedSharedPreferences() {
        return null;
    }
    
    public final boolean getVfsEnabled() {
        return false;
    }
    
    public final void setVfsEnabled(boolean value) {
    }
    
    public final boolean getDebugLogs() {
        return false;
    }
    
    public final void setDebugLogs(boolean value) {
    }
    
    public final boolean getLogcatLogsOutput() {
        return false;
    }
    
    public final void setLogcatLogsOutput(boolean value) {
    }
    
    public final boolean getAutoStart() {
        return false;
    }
    
    public final void setAutoStart(boolean value) {
    }
    
    public final boolean getKeepServiceAlive() {
        return false;
    }
    
    public final void setKeepServiceAlive(boolean value) {
    }
    
    public final boolean getReadAndAgreeTermsAndPrivacy() {
        return false;
    }
    
    public final void setReadAndAgreeTermsAndPrivacy(boolean value) {
    }
    
    public final boolean getForcePortrait() {
        return false;
    }
    
    public final void setForcePortrait(boolean value) {
    }
    
    public final boolean getReplaceSipUriByUsername() {
        return false;
    }
    
    public final void setReplaceSipUriByUsername(boolean value) {
    }
    
    public final boolean getEnableAnimations() {
        return false;
    }
    
    public final void setEnableAnimations(boolean value) {
    }
    
    public final int getDarkMode() {
        return 0;
    }
    
    public final void setDarkMode(int value) {
    }
    
    public final boolean getDisableSecureMode() {
        return false;
    }
    
    public final void setDisableSecureMode(boolean value) {
    }
    
    public final boolean getVideoPreview() {
        return false;
    }
    
    public final void setVideoPreview(boolean value) {
    }
    
    public final boolean getPreventMoreThanOneFilePerMessage() {
        return false;
    }
    
    public final void setPreventMoreThanOneFilePerMessage(boolean value) {
    }
    
    public final boolean getMarkAsReadUponChatMessageNotificationDismissal() {
        return false;
    }
    
    public final void setMarkAsReadUponChatMessageNotificationDismissal(boolean value) {
    }
    
    public final boolean getMakePublicMediaFilesDownloaded() {
        return false;
    }
    
    public final void setMakePublicMediaFilesDownloaded(boolean value) {
    }
    
    public final boolean getUseInAppFileViewerForNonEncryptedFiles() {
        return false;
    }
    
    public final void setUseInAppFileViewerForNonEncryptedFiles(boolean value) {
    }
    
    public final boolean getHideChatMessageContentInNotification() {
        return false;
    }
    
    public final void setHideChatMessageContentInNotification(boolean value) {
    }
    
    public final boolean getHideEmptyRooms() {
        return false;
    }
    
    public final void setHideEmptyRooms(boolean value) {
    }
    
    public final boolean getHideRoomsFromRemovedProxies() {
        return false;
    }
    
    public final void setHideRoomsFromRemovedProxies(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDeviceName() {
        return null;
    }
    
    public final void setDeviceName(@org.jetbrains.annotations.NotNull
    java.lang.String value) {
    }
    
    public final boolean getChatRoomShortcuts() {
        return false;
    }
    
    public final void setChatRoomShortcuts(boolean value) {
    }
    
    public final int getVoiceRecordingMaxDuration() {
        return 0;
    }
    
    public final void setVoiceRecordingMaxDuration(int value) {
    }
    
    public final boolean getHoldToRecordVoiceMessage() {
        return false;
    }
    
    public final void setHoldToRecordVoiceMessage(boolean value) {
    }
    
    public final boolean getSendVoiceRecordingRightAway() {
        return false;
    }
    
    public final void setSendVoiceRecordingRightAway(boolean value) {
    }
    
    public final boolean getStorePresenceInNativeContact() {
        return false;
    }
    
    public final void setStorePresenceInNativeContact(boolean value) {
    }
    
    public final boolean getShowNewContactAccountDialog() {
        return false;
    }
    
    public final void setShowNewContactAccountDialog(boolean value) {
    }
    
    public final boolean getDisplayOrganization() {
        return false;
    }
    
    public final void setDisplayOrganization(boolean value) {
    }
    
    public final boolean getContactsShortcuts() {
        return false;
    }
    
    public final void setContactsShortcuts(boolean value) {
    }
    
    public final boolean getPublishPresence() {
        return false;
    }
    
    public final void setPublishPresence(boolean value) {
    }
    
    public final boolean getSendEarlyMedia() {
        return false;
    }
    
    public final void setSendEarlyMedia(boolean value) {
    }
    
    public final boolean getAcceptEarlyMedia() {
        return false;
    }
    
    public final void setAcceptEarlyMedia(boolean value) {
    }
    
    public final boolean getAutoAnswerEnabled() {
        return false;
    }
    
    public final void setAutoAnswerEnabled(boolean value) {
    }
    
    public final int getAutoAnswerDelay() {
        return 0;
    }
    
    public final void setAutoAnswerDelay(int value) {
    }
    
    public final boolean getShowCallOverlay() {
        return false;
    }
    
    public final void setShowCallOverlay(boolean value) {
    }
    
    public final boolean getSystemWideCallOverlay() {
        return false;
    }
    
    public final void setSystemWideCallOverlay(boolean value) {
    }
    
    public final boolean getCallRightAway() {
        return false;
    }
    
    public final void setCallRightAway(boolean value) {
    }
    
    public final boolean getSkipDialerForNewCallAndTransfer() {
        return false;
    }
    
    public final void setSkipDialerForNewCallAndTransfer(boolean value) {
    }
    
    public final boolean getAutomaticallyStartCallRecording() {
        return false;
    }
    
    public final void setAutomaticallyStartCallRecording(boolean value) {
    }
    
    public final boolean getUseTelecomManager() {
        return false;
    }
    
    public final void setUseTelecomManager(boolean value) {
    }
    
    public final boolean getManuallyDisabledTelecomManager() {
        return false;
    }
    
    public final void setManuallyDisabledTelecomManager(boolean value) {
    }
    
    public final boolean getRouteAudioToBluetoothIfAvailable() {
        return false;
    }
    
    public final void setRouteAudioToBluetoothIfAvailable(boolean value) {
    }
    
    public final boolean getRouteAudioToSpeakerWhenVideoIsEnabled() {
        return false;
    }
    
    public final void setRouteAudioToSpeakerWhenVideoIsEnabled(boolean value) {
    }
    
    public final boolean getPauseCallsWhenAudioFocusIsLost() {
        return false;
    }
    
    public final void setPauseCallsWhenAudioFocusIsLost(boolean value) {
    }
    
    public final boolean getEnableFullScreenWhenJoiningVideoCall() {
        return false;
    }
    
    public final void setEnableFullScreenWhenJoiningVideoCall(boolean value) {
    }
    
    public final boolean getEnableFullScreenWhenJoiningVideoConference() {
        return false;
    }
    
    public final void setEnableFullScreenWhenJoiningVideoConference(boolean value) {
    }
    
    public final boolean getDisableBroadcastConference() {
        return false;
    }
    
    public final void setDisableBroadcastConference(boolean value) {
    }
    
    public final boolean getFirstStart() {
        return false;
    }
    
    public final void setFirstStart(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getXmlRpcServerUrl() {
        return null;
    }
    
    public final void setXmlRpcServerUrl(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    public final boolean getHideLinkPhoneNumber() {
        return false;
    }
    
    public final void setHideLinkPhoneNumber(boolean value) {
    }
    
    public final boolean getLimeSecurityPopupEnabled() {
        return false;
    }
    
    public final void setLimeSecurityPopupEnabled(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getVoiceMailUri() {
        return null;
    }
    
    public final void setVoiceMailUri(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    public final boolean getRedirectDeclinedCallToVoiceMail() {
        return false;
    }
    
    public final void setRedirectDeclinedCallToVoiceMail(boolean value) {
    }
    
    public final int getLastUpdateAvailableCheckTimestamp() {
        return 0;
    }
    
    public final void setLastUpdateAvailableCheckTimestamp(int value) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDefaultAccountAvatarPath() {
        return null;
    }
    
    public final void setDefaultAccountAvatarPath(@org.jetbrains.annotations.Nullable
    java.lang.String value) {
    }
    
    public final boolean getContactOrganizationVisible() {
        return false;
    }
    
    private final boolean getDarkModeAllowed() {
        return false;
    }
    
    public final boolean getShowScreenshotButton() {
        return false;
    }
    
    public final boolean getDtmfKeypadVibration() {
        return false;
    }
    
    public final boolean getAllowMultipleFilesAndTextInSameMessage() {
        return false;
    }
    
    public final boolean getEnableNativeAddressBookIntegration() {
        return false;
    }
    
    public final boolean getFetchContactsFromDefaultDirectory() {
        return false;
    }
    
    public final int getDelayBeforeShowingContactsSearchSpinner() {
        return 0;
    }
    
    public final boolean getPreferNormalizedPhoneNumbersFromAddressBook() {
        return false;
    }
    
    public final boolean getHideStaticImageCamera() {
        return false;
    }
    
    public final boolean getReadOnlyNativeContacts() {
        return false;
    }
    
    public final boolean getOnlyShowSipContactsList() {
        return false;
    }
    
    public final boolean getHideSipContactsList() {
        return false;
    }
    
    public final boolean getDisableChat() {
        return false;
    }
    
    public final boolean getDisableVideo() {
        return false;
    }
    
    public final boolean getForceEndToEndEncryptedChat() {
        return false;
    }
    
    public final boolean getAllowEndToEndEncryptedChatWithoutPresence() {
        return false;
    }
    
    public final boolean getAllowGroupChatWithoutPresence() {
        return false;
    }
    
    public final boolean getShowEmojiPickerButton() {
        return false;
    }
    
    public final boolean getPreventInterfaceFromShowingUp() {
        return false;
    }
    
    public final boolean getVoiceMessagesFormatMkv() {
        return false;
    }
    
    public final boolean getUseEphemeralPerDeviceMode() {
        return false;
    }
    
    public final boolean getShowAllRingtones() {
        return false;
    }
    
    public final boolean getShowContactInviteBySms() {
        return false;
    }
    
    public final boolean getAutoRemoteProvisioningOnConfigUriHandler() {
        return false;
    }
    
    public final boolean getAskForAccountPasswordToAccessSettings() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDefaultDomain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDefaultRlsUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDebugPopupCode() {
        return null;
    }
    
    public final int getMaxConferenceParticipantsForMosaicLayout() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConferenceServerUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getAudioVideoConferenceServerUri() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLimeServerUrl() {
        return null;
    }
    
    public final int getCheckUpdateAvailableInterval() {
        return 0;
    }
    
    public final boolean getShowCreateAccount() {
        return false;
    }
    
    public final boolean getShowLinphoneLogin() {
        return false;
    }
    
    public final boolean getShowGenericLogin() {
        return false;
    }
    
    public final boolean getShowRemoteProvisioning() {
        return false;
    }
    
    public final boolean getShowAccountsInSideMenu() {
        return false;
    }
    
    public final boolean getShowAssistantInSideMenu() {
        return false;
    }
    
    public final boolean getShowSettingsInSideMenu() {
        return false;
    }
    
    public final boolean getShowRecordingsInSideMenu() {
        return false;
    }
    
    public final boolean getShowScheduledConferencesInSideMenu() {
        return false;
    }
    
    public final boolean getShowAboutInSideMenu() {
        return false;
    }
    
    public final boolean getShowQuitInSideMenu() {
        return false;
    }
    
    public final boolean getAllowDtlsTransport() {
        return false;
    }
    
    public final boolean getShowAccountSettings() {
        return false;
    }
    
    public final boolean getShowTunnelSettings() {
        return false;
    }
    
    public final boolean getShowAudioSettings() {
        return false;
    }
    
    public final boolean getShowVideoSettings() {
        return false;
    }
    
    public final boolean getShowCallSettings() {
        return false;
    }
    
    public final boolean getShowChatSettings() {
        return false;
    }
    
    public final boolean getShowNetworkSettings() {
        return false;
    }
    
    public final boolean getShowContactsSettings() {
        return false;
    }
    
    public final boolean getShowAdvancedSettings() {
        return false;
    }
    
    public final boolean getShowConferencesSettings() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getConfigPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFactoryConfigPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLinphoneDefaultValuesPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDefaultValuesPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRingtonesPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getDefaultRingtonePath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUserCertificatesPath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getStaticPicturePath() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getVfsCachePath() {
        return null;
    }
    
    public final void copyAssetsFromPackage() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getString(int resource) {
        return null;
    }
    
    private final void copy(java.lang.String from, java.lang.String to, boolean overrideIfExists) {
    }
    
    private final void move(java.lang.String from, java.lang.String to, boolean overrideIfExists) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/linphone/core/CorePreferences$Companion;", "", "()V", "OVERLAY_CLICK_SENSITIVITY", "", "encryptedSharedPreferencesFile", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}