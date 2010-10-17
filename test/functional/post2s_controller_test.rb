require 'test_helper'

class Post2sControllerTest < ActionController::TestCase
  test "should get index" do
    get :index
    assert_response :success
    assert_not_nil assigns(:post2s)
  end

  test "should get new" do
    get :new
    assert_response :success
  end

  test "should create post2" do
    assert_difference('Post2.count') do
      post :create, :post2 => { }
    end

    assert_redirected_to post2_path(assigns(:post2))
  end

  test "should show post2" do
    get :show, :id => post2s(:one).id
    assert_response :success
  end

  test "should get edit" do
    get :edit, :id => post2s(:one).id
    assert_response :success
  end

  test "should update post2" do
    put :update, :id => post2s(:one).id, :post2 => { }
    assert_redirected_to post2_path(assigns(:post2))
  end

  test "should destroy post2" do
    assert_difference('Post2.count', -1) do
      delete :destroy, :id => post2s(:one).id
    end

    assert_redirected_to post2s_path
  end
end
