class CreatePost2s < ActiveRecord::Migration
  def self.up
    create_table :post2s do |t|
      t.string :title
      t.text :body

      t.timestamps
    end
  end

  def self.down
    drop_table :post2s
  end
end
