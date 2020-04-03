/*
 * Automatically generated by jrpcgen 1.0.7+ on 11/1/19, 1:52 PM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.xdr;
import org.dcache.oncrpc4j.rpc.*;
import org.dcache.oncrpc4j.xdr.*;
import java.io.IOException;

public class SETXATTR4args implements XdrAble {
    public int sxa_option;
    public String sxa_name;
    public xattrvalue4 sxa_value;

    public SETXATTR4args() {
    }

    public SETXATTR4args(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        xdr.xdrEncodeInt(sxa_option);
        xdr.xdrEncodeString(sxa_name);
        sxa_value.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        sxa_option = xdr.xdrDecodeInt();
        sxa_name = xdr.xdrDecodeString();
        sxa_value = new xattrvalue4(xdr);
    }

}
// End of SETXATTR4args.java