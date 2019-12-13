/*
 * Automatically generated by jrpcgen 1.0.7+ on 1/8/15 10:21 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.ff;
import org.dcache.oncrpc4j.rpc.OncRpcException;
import org.dcache.oncrpc4j.xdr.XdrAble;
import org.dcache.oncrpc4j.xdr.XdrDecodingStream;
import org.dcache.oncrpc4j.xdr.XdrEncodingStream;
import java.io.IOException;

import org.dcache.nfs.v4.xdr.device_error4;
import org.dcache.nfs.v4.xdr.length4;
import org.dcache.nfs.v4.xdr.offset4;
import org.dcache.nfs.v4.xdr.stateid4;

public class ff_ioerr4 implements XdrAble {
    public offset4 ffie_offset;
    public length4 ffie_length;
    public stateid4 ffie_stateid;
    public device_error4[] ffie_errors;

    public ff_ioerr4() {
    }

    public ff_ioerr4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        ffie_offset.xdrEncode(xdr);
        ffie_length.xdrEncode(xdr);
        ffie_stateid.xdrEncode(xdr);

        int size = ffie_errors.length;
        xdr.xdrEncodeInt(size);
        for (int i = 0; i < size; i++) {
            ffie_errors[i].xdrEncode(xdr);
        }
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        ffie_offset = new offset4(xdr);
        ffie_length = new length4(xdr);
        ffie_stateid = new stateid4(xdr);
        int size = xdr.xdrDecodeInt();

        ffie_errors = new device_error4[size];
        for(int i = 0; i < size; i++) {
            ffie_errors[i] = new device_error4(xdr);
        }
    }

}
// End of ff_ioerr4.java
