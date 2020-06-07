package com.example.finalwallpaperapp.activity



import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.finalwallpaperapp.R
import com.example.finalwallpaperapp.adapter.GalleryImageAdapter
import com.example.finalwallpaperapp.adapter.GalleryImageClickListener
import com.example.finalwallpaperapp.fragment.GalleryFullscreenFragment
import kotlinx.android.synthetic.main.activity_main2.*
import com.example.finalwallpaperapp.adapter.Image

class Main2Activity : AppCompatActivity(), GalleryImageClickListener {


    //gallery column count
    private val SPANCOUNT = 3

    private val imageList = ArrayList<Image>()
    lateinit var galleryAdapter: GalleryImageAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        //init adapter
        galleryAdapter = GalleryImageAdapter(imageList)
        galleryAdapter.listener = this

        //init recycler view
        recyclerView.layoutManager = GridLayoutManager(this, SPANCOUNT)
        recyclerView.adapter = galleryAdapter

        //load images
        loadImages()

    }


    private fun loadImages() {


        imageList.add(Image(R.drawable.img1))
        imageList.add(Image(R.drawable.img002))
        imageList.add(Image(R.drawable.img3))
        imageList.add(Image(R.drawable.img04))
        imageList.add(Image(R.drawable.img005))
        imageList.add(Image(R.drawable.img006))
        imageList.add(Image(R.drawable.img007))
        imageList.add(Image(R.drawable.img008))
        imageList.add(Image(R.drawable.img09))
        imageList.add(Image(R.drawable.img011))
        imageList.add(Image(R.drawable.img012))
        imageList.add(Image(R.drawable.img0013))
        imageList.add(Image(R.drawable.img14))
        imageList.add(Image(R.drawable.img15))
        imageList.add(Image(R.drawable.img16))
        imageList.add(Image(R.drawable.img17))
        imageList.add(Image(R.drawable.img18))
        imageList.add(Image(R.drawable.img19))
        imageList.add(Image(R.drawable.img21))
        imageList.add(Image(R.drawable.img22))
        imageList.add(Image(R.drawable.img23))
        imageList.add(Image(R.drawable.img24))
        imageList.add(Image(R.drawable.img25))
        imageList.add(Image(R.drawable.img26))
        imageList.add(Image(R.drawable.img27))
        imageList.add(Image(R.drawable.img28))
        imageList.add(Image(R.drawable.img29))
        imageList.add(Image(R.drawable.img31))
        imageList.add(Image(R.drawable.img32))
        imageList.add(Image(R.drawable.img33))



        galleryAdapter.notifyDataSetChanged()
    }

    override fun onClick(position: Int) {
        //handle click of image
        val bundle = Bundle()
        bundle.putSerializable("images", imageList)
        bundle.putInt("position", position)
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val galleryFragment = GalleryFullscreenFragment()
        galleryFragment.arguments = bundle
        galleryFragment.show(fragmentTransaction, "gallery")
    }

}
