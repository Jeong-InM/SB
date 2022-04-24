package duksung.CapstoneDesign.Project.TadakTadak

import android.app.Activity
import android.content.ContentValues.TAG
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.children
import androidx.viewbinding.ViewBinding
import com.yanzhenjie.permission.AndPermission
import com.yanzhenjie.permission.FileProvider
import com.yanzhenjie.permission.runtime.Permission
import duksung.CapstoneDesign.Project.TadakTadak.databinding.FragmentNaviHomeBinding
import kotlinx.android.synthetic.main.fragment_edit.*
import kotlinx.android.synthetic.main.fragment_navi_home.view.*
import java.io.File


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


/**
 * A simple [Fragment] subclass.
 * Use the [NaviHome.newInstance] factory method to
 * create an instance of this fragment.
 */
class NaviHome : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    var uri: Uri? =null
    lateinit var mContext : Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }








/*
        AndPermission.with(this)
            .runtime()
            .permission(Permission.Group.STORAGE)
            .onGranted { permissions ->
                Log.d("Main", "허용된 권한 갯수 : ${permissions.size}")
            }
            .onDenied { permissions ->
        Log.d("Main", "거부된 권한 갯수 : ${permissions.size}")
        }
    .start()
    }




*/
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =inflater.inflate(R.layout.fragment_navi_home, container, false)
/*
        view.btnCamera.setOnClickListener{
            takePhoto()
        }
        view.btnGallery.setOnClickListener{
            getFromeAlbum()
        }*/
        return view
    }





/*
    fun takePhoto() {
        val capturedFile = File(Activity!!.externalCacheDir, "captured.jpg")
        if(capturedFile.exists()){
            capturedFile.delete()
        }
        capturedFile.createNewFile()
        uri = if(Build.VERSION.SDK_INT >=24) {
            FileProvider.getUriForFile(mContext, "duksung.CapstoneDesign.Project.TadakTadak.fileprovider", capturedFile)
        }
        else{
            Uri.fromFile(capturedFile)
        }
        val intent = Intent("android.media.action.IMAGE_CAPTURE")
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri)
        startActivityForResult(intent, 101)
    }

    fun getFromeAlbum(){
        val intent =Intent("android.intent.action.GET_CONTENT")
        intent.type="image/*"
        startActivityForResult(intent, 102)

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when (requestCode) {
            101 -> {
                if (resultCode == Activity.RESULT_OK) {
                    val bitmap =
                        BitmapFactory.decodeStream(activity!!.contentResolver.openInputStream(uri!!))
                    Edit_imageView.setImageBitmap(bitmap)
                }
            }
            102 -> {
                if (resultCode == Activity.RESULT_OK) {
                    if (Build.VERSION.SDK_INT >= 19) {
                        uri =data?.data
                        if(uri !=null){
                            val bitmap = BitmapFactory.decodeStream(
                                activity!!.contentResolver.openInputStream(uri!!)
                            )
                            Edit_imageView.setImageBitmap(bitmap)
                        }
                    }

                    }
                }
            }
        }

    override fun onAttach(activity: Activity) {
        super.onAttach(activity)
        if(context is MainActivity){
            mContext = context as MainActivity
        }
    }
*/



 */
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment NaviContractCollection.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            NaviHome().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}