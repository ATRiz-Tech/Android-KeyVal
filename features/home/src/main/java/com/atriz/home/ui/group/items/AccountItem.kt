package com.atriz.home.ui.group.items

import android.view.View
import com.atriz.home.R
import com.atriz.home.databinding.ItemAccountBinding
import com.atriz.home.utils.BitmapUtils
import com.xwray.groupie.viewbinding.BindableItem

class AccountItem(
    private val name: String,
    private val lastUpdate: String
) : BindableItem<ItemAccountBinding>() {

    companion object {
        private const val ICON_SIZE = 50F
    }

    override fun getLayout() = R.layout.item_account

    override fun bind(viewBinding: ItemAccountBinding, position: Int) {
        viewBinding.accountTextName.text = name
        viewBinding.accountTextLastUpdate.text = lastUpdate

        val icon = BitmapUtils.stringToBitmap(position.toString(), ICON_SIZE, R.color.coal_gray)

        viewBinding.accountImageIcon.setImageBitmap(icon)
    }

    override fun initializeViewBinding(view: View) = ItemAccountBinding.bind(view)
}
